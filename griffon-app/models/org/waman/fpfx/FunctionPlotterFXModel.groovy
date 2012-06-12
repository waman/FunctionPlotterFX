package org.waman.fpfx

import groovyx.javafx.beans.FXBindable
import griffon.util.GriffonNameUtils

class FunctionPlotterFXModel {
    @FXBindable String message

    void mvcGroupInit(Map args) {
        message = "Welcome to ${GriffonNameUtils.capitalize(app.config.application.title)}, a JavaFX application"
    }
}
