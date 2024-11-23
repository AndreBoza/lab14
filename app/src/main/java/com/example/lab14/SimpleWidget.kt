package com.example.lab14

import androidx.glance.appwidget.GlanceAppWidget
import androidx.glance.appwidget.GlanceAppWidgetReceiver
import com.josuerdx.lab14.widget.content.SimpleWidgetContent

class SimpleWidget : GlanceAppWidgetReceiver() {
    override val glanceAppWidget: GlanceAppWidget = SimpleWidgetContent()
}
