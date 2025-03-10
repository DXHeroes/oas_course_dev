/* tslint:disable */
/* eslint-disable */
/**
 * Coffee Shop API
 * API for managing orders and menu in a coffee shop.
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: support@coffeshop.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


import * as runtime from '../runtime';
import type {
  MenuItem,
} from '../models/index';
import {
    MenuItemFromJSON,
    MenuItemToJSON,
} from '../models/index';

export interface CreateMenuItemRequest {
    menuItem: MenuItem;
}

export interface GetMenuByIdRequest {
    menuId: number;
}

export interface UpdateMenuRequest {
    menuId: number;
    menuItem: MenuItem;
}

/**
 * 
 */
export class MenuApi extends runtime.BaseAPI {

    /**
     * Creates a new menu item in the coffee shop.
     * Create a new menu item
     */
    async createMenuItemRaw(requestParameters: CreateMenuItemRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<runtime.ApiResponse<MenuItem>> {
        if (requestParameters['menuItem'] == null) {
            throw new runtime.RequiredError(
                'menuItem',
                'Required parameter "menuItem" was null or undefined when calling createMenuItem().'
            );
        }

        const queryParameters: any = {};

        const headerParameters: runtime.HTTPHeaders = {};

        headerParameters['Content-Type'] = 'application/json';

        if (this.configuration && (this.configuration.username !== undefined || this.configuration.password !== undefined)) {
            headerParameters["Authorization"] = "Basic " + btoa(this.configuration.username + ":" + this.configuration.password);
        }
        const response = await this.request({
            path: `/menu`,
            method: 'POST',
            headers: headerParameters,
            query: queryParameters,
            body: MenuItemToJSON(requestParameters['menuItem']),
        }, initOverrides);

        return new runtime.JSONApiResponse(response, (jsonValue) => MenuItemFromJSON(jsonValue));
    }

    /**
     * Creates a new menu item in the coffee shop.
     * Create a new menu item
     */
    async createMenuItem(requestParameters: CreateMenuItemRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<MenuItem> {
        const response = await this.createMenuItemRaw(requestParameters, initOverrides);
        return await response.value();
    }

    /**
     * Returns the current menu of the coffee shop.
     * Get menu
     */
    async getMenuRaw(initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<runtime.ApiResponse<Array<MenuItem>>> {
        const queryParameters: any = {};

        const headerParameters: runtime.HTTPHeaders = {};

        if (this.configuration && (this.configuration.username !== undefined || this.configuration.password !== undefined)) {
            headerParameters["Authorization"] = "Basic " + btoa(this.configuration.username + ":" + this.configuration.password);
        }
        const response = await this.request({
            path: `/menu`,
            method: 'GET',
            headers: headerParameters,
            query: queryParameters,
        }, initOverrides);

        return new runtime.JSONApiResponse(response, (jsonValue) => jsonValue.map(MenuItemFromJSON));
    }

    /**
     * Returns the current menu of the coffee shop.
     * Get menu
     */
    async getMenu(initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<Array<MenuItem>> {
        const response = await this.getMenuRaw(initOverrides);
        return await response.value();
    }

    /**
     * Returns the menu of the coffee shop by ID.
     * Get menu by ID
     */
    async getMenuByIdRaw(requestParameters: GetMenuByIdRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<runtime.ApiResponse<MenuItem>> {
        if (requestParameters['menuId'] == null) {
            throw new runtime.RequiredError(
                'menuId',
                'Required parameter "menuId" was null or undefined when calling getMenuById().'
            );
        }

        const queryParameters: any = {};

        const headerParameters: runtime.HTTPHeaders = {};

        if (this.configuration && (this.configuration.username !== undefined || this.configuration.password !== undefined)) {
            headerParameters["Authorization"] = "Basic " + btoa(this.configuration.username + ":" + this.configuration.password);
        }
        const response = await this.request({
            path: `/menu/{menuId}`.replace(`{${"menuId"}}`, encodeURIComponent(String(requestParameters['menuId']))),
            method: 'GET',
            headers: headerParameters,
            query: queryParameters,
        }, initOverrides);

        return new runtime.JSONApiResponse(response, (jsonValue) => MenuItemFromJSON(jsonValue));
    }

    /**
     * Returns the menu of the coffee shop by ID.
     * Get menu by ID
     */
    async getMenuById(requestParameters: GetMenuByIdRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<MenuItem> {
        const response = await this.getMenuByIdRaw(requestParameters, initOverrides);
        return await response.value();
    }

    /**
     * Updates the entire menu of the coffee shop.
     * Update the menu
     */
    async updateMenuRaw(requestParameters: UpdateMenuRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<runtime.ApiResponse<MenuItem>> {
        if (requestParameters['menuId'] == null) {
            throw new runtime.RequiredError(
                'menuId',
                'Required parameter "menuId" was null or undefined when calling updateMenu().'
            );
        }

        if (requestParameters['menuItem'] == null) {
            throw new runtime.RequiredError(
                'menuItem',
                'Required parameter "menuItem" was null or undefined when calling updateMenu().'
            );
        }

        const queryParameters: any = {};

        const headerParameters: runtime.HTTPHeaders = {};

        headerParameters['Content-Type'] = 'application/json';

        if (this.configuration && (this.configuration.username !== undefined || this.configuration.password !== undefined)) {
            headerParameters["Authorization"] = "Basic " + btoa(this.configuration.username + ":" + this.configuration.password);
        }
        const response = await this.request({
            path: `/menu/{menuId}`.replace(`{${"menuId"}}`, encodeURIComponent(String(requestParameters['menuId']))),
            method: 'PUT',
            headers: headerParameters,
            query: queryParameters,
            body: MenuItemToJSON(requestParameters['menuItem']),
        }, initOverrides);

        return new runtime.JSONApiResponse(response, (jsonValue) => MenuItemFromJSON(jsonValue));
    }

    /**
     * Updates the entire menu of the coffee shop.
     * Update the menu
     */
    async updateMenu(requestParameters: UpdateMenuRequest, initOverrides?: RequestInit | runtime.InitOverrideFunction): Promise<MenuItem> {
        const response = await this.updateMenuRaw(requestParameters, initOverrides);
        return await response.value();
    }

}
