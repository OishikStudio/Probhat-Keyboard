/*
 * Copyright (C) 2012 The Android Open Source Project
 * modified
 * SPDX-License-Identifier: Apache-2.0 AND GPL-3.0-only
 */

package probhat.keyboard.latin.define

object ProductionFlags {
    const val IS_HARDWARE_KEYBOARD_SUPPORTED = true
    // todo: test whether there are issues

    /**
     * Include all suggestions from all dictionaries in
     * [probhat.keyboard.latin.SuggestedWords.mRawSuggestions].
     */
    const val INCLUDE_RAW_SUGGESTIONS = false
}