package io.homeassistant.companion.android.widgets

import dagger.Component
import io.homeassistant.companion.android.common.dagger.AppComponent
import io.homeassistant.companion.android.widgets.button.ButtonWidget
import io.homeassistant.companion.android.widgets.button.ButtonWidgetConfigureActivity
import io.homeassistant.companion.android.widgets.camera.CameraWidget
import io.homeassistant.companion.android.widgets.camera.CameraWidgetConfigureActivity
import io.homeassistant.companion.android.widgets.entity.EntityWidget
import io.homeassistant.companion.android.widgets.entity.EntityWidgetConfigureActivity
import io.homeassistant.companion.android.widgets.media_player_controls.MediaPlayerControlsWidget
import io.homeassistant.companion.android.widgets.media_player_controls.MediaPlayerControlsWidgetConfigureActivity
import io.homeassistant.companion.android.widgets.template.TemplateWidget
import io.homeassistant.companion.android.widgets.template.TemplateWidgetConfigureActivity

@Component(dependencies = [AppComponent::class])
interface ProviderComponent {

    fun inject(receiver: ButtonWidget)
    fun inject(activity: ButtonWidgetConfigureActivity)

    fun inject(receiver: CameraWidget)
    fun inject(activity: CameraWidgetConfigureActivity)

    fun inject(receiver: MediaPlayerControlsWidget)
    fun inject(activity: MediaPlayerControlsWidgetConfigureActivity)

    fun inject(receiver: EntityWidget)
    fun inject(activity: EntityWidgetConfigureActivity)

    fun inject(receiver: TemplateWidget)
    fun inject(activity: TemplateWidgetConfigureActivity)
}
