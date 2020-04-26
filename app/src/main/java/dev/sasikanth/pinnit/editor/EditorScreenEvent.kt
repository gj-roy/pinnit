package dev.sasikanth.pinnit.editor

import dev.sasikanth.pinnit.data.PinnitNotification

sealed class EditorScreenEvent

data class NotificationLoaded(val notification: PinnitNotification) : EditorScreenEvent()

data class TitleChanged(val title: String) : EditorScreenEvent()

object SaveClicked : EditorScreenEvent()
