// Copyright 2018 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

package io.flutter.plugin.platform;


/**
 * Registry for platform view factories.
 * <p>
 * Plugins can register factories for specific view types.
 */
public interface PlatformViewRegistry {

    /**
     * Registers a factory for a platform view.
     *
     * @param viewTypeId unique identifier for the platform view's type.
     * @param factory    factory for creating platform views of the specified type.
     * @return true if succeeded, false if a factory is already registered for viewTypeId.
     */
    boolean registerViewFactory(String viewTypeId, PlatformViewFactory factory);
}
