application {
    title = 'FunctionPlotterFX'
    startupGroups = ['functionPlotterFX']

    // Should Griffon exit when no Griffon created frames are showing?
    autoShutdown = true

    // If you want some non-standard application class, apply it here
    //frameClass = 'javax.swing.JFrame'
}
mvcGroups {
    // MVC Group for "functionPlotterFX"
    'functionPlotterFX' {
        model      = 'org.waman.fpfx.FunctionPlotterFXModel'
        view       = 'org.waman.fpfx.FunctionPlotterFXView'
        controller = 'org.waman.fpfx.FunctionPlotterFXController'
    }

}
