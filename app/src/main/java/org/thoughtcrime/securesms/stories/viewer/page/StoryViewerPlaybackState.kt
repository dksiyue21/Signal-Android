package org.thoughtcrime.securesms.stories.viewer.page

data class StoryViewerPlaybackState(
  val areSegmentsInitialized: Boolean = false,
  val isUserTouching: Boolean = false,
  val isDisplayingForwardDialog: Boolean = false,
  val isDisplayingDeleteDialog: Boolean = false,
  val isDisplayingContextMenu: Boolean = false,
  val isDisplayingViewsAndRepliesDialog: Boolean = false,
  val isDisplayingDirectReplyDialog: Boolean = false,
  val isDisplayingCaptionOverlay: Boolean = false
) {
  val isPaused: Boolean = !areSegmentsInitialized ||
    isUserTouching ||
    isDisplayingCaptionOverlay ||
    isDisplayingForwardDialog ||
    isDisplayingDeleteDialog ||
    isDisplayingContextMenu ||
    isDisplayingViewsAndRepliesDialog ||
    isDisplayingDirectReplyDialog ||
    isDisplayingCaptionOverlay
}