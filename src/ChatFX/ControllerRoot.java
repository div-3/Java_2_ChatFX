package ChatFX;

import javafx.fxml.FXML;
import javafx.scene.control.MenuItem;

public class ControllerRoot {
    Controller ctrlBase = new Controller();
    @FXML
    MenuItem btnClose;

    @FXML
    MenuItem btnClearHistory;

    @FXML
    MenuItem btnAbout;

    //Обработка нажатия кнопки меню "Выход"
    public void close(){
        System.exit(0);
    }

    //Обработка нажатия кнопки меню "Очистить историю сообщений"
    public void clearHistoryRoot(){
        ctrlBase.clearHistory();
    }
    //Почему-то выдаёт NullPoinExsc при такм вызове
    /*Exception in thread "JavaFX Application Thread" java.lang.RuntimeException: java.lang.reflect.InvocationTargetException
	at javafx.fxml.FXMLLoader$MethodHandler.invoke(FXMLLoader.java:1774)
	at javafx.fxml.FXMLLoader$ControllerMethodEventHandler.handle(FXMLLoader.java:1657)
	at com.sun.javafx.event.CompositeEventHandler.dispatchBubblingEvent(CompositeEventHandler.java:86)
	at com.sun.javafx.event.EventHandlerManager.dispatchBubblingEvent(EventHandlerManager.java:238)
	at com.sun.javafx.event.EventHandlerManager.dispatchBubblingEvent(EventHandlerManager.java:191)
	at com.sun.javafx.event.BasicEventDispatcher.dispatchEvent(BasicEventDispatcher.java:58)
	at com.sun.javafx.event.EventDispatchChainImpl.dispatchEvent(EventDispatchChainImpl.java:114)
	at com.sun.javafx.event.EventUtil.fireEventImpl(EventUtil.java:74)
	at com.sun.javafx.event.EventUtil.fireEvent(EventUtil.java:49)
	at javafx.event.Event.fireEvent(Event.java:198)
	at javafx.scene.control.MenuItem.fire(MenuItem.java:462)
	at com.sun.javafx.scene.control.skin.ContextMenuContent$MenuItemContainer.doSelect(ContextMenuContent.java:1405)
	at com.sun.javafx.scene.control.skin.ContextMenuContent$MenuItemContainer.lambda$createChildren$343(ContextMenuContent.java:1358)
	at com.sun.javafx.event.CompositeEventHandler$NormalEventHandlerRecord.handleBubblingEvent(CompositeEventHandler.java:218)
	at com.sun.javafx.event.CompositeEventHandler.dispatchBubblingEvent(CompositeEventHandler.java:80)
	at com.sun.javafx.event.EventHandlerManager.dispatchBubblingEvent(EventHandlerManager.java:238)
	at com.sun.javafx.event.EventHandlerManager.dispatchBubblingEvent(EventHandlerManager.java:191)
	at com.sun.javafx.event.CompositeEventDispatcher.dispatchBubblingEvent(CompositeEventDispatcher.java:59)
	at com.sun.javafx.event.BasicEventDispatcher.dispatchEvent(BasicEventDispatcher.java:58)
	at com.sun.javafx.event.EventDispatchChainImpl.dispatchEvent(EventDispatchChainImpl.java:114)
	at com.sun.javafx.event.BasicEventDispatcher.dispatchEvent(BasicEventDispatcher.java:56)
	at com.sun.javafx.event.EventDispatchChainImpl.dispatchEvent(EventDispatchChainImpl.java:114)
	at com.sun.javafx.event.BasicEventDispatcher.dispatchEvent(BasicEventDispatcher.java:56)
	at com.sun.javafx.event.EventDispatchChainImpl.dispatchEvent(EventDispatchChainImpl.java:114)
	at com.sun.javafx.event.BasicEventDispatcher.dispatchEvent(BasicEventDispatcher.java:56)
	at com.sun.javafx.event.EventDispatchChainImpl.dispatchEvent(EventDispatchChainImpl.java:114)
	at com.sun.javafx.event.EventUtil.fireEventImpl(EventUtil.java:74)
	at com.sun.javafx.event.EventUtil.fireEvent(EventUtil.java:54)
	at javafx.event.Event.fireEvent(Event.java:198)
	at javafx.scene.Scene$MouseHandler.process(Scene.java:3757)
	at javafx.scene.Scene$MouseHandler.access$1500(Scene.java:3485)
	at javafx.scene.Scene.impl_processMouseEvent(Scene.java:1762)
	at javafx.scene.Scene$ScenePeerListener.mouseEvent(Scene.java:2494)
	at com.sun.javafx.tk.quantum.GlassViewEventHandler$MouseEventNotification.run(GlassViewEventHandler.java:381)
	at com.sun.javafx.tk.quantum.GlassViewEventHandler$MouseEventNotification.run(GlassViewEventHandler.java:295)
	at java.security.AccessController.doPrivileged(Native Method)
	at com.sun.javafx.tk.quantum.GlassViewEventHandler.lambda$handleMouseEvent$354(GlassViewEventHandler.java:417)
	at com.sun.javafx.tk.quantum.QuantumToolkit.runWithoutRenderLock(QuantumToolkit.java:389)
	at com.sun.javafx.tk.quantum.GlassViewEventHandler.handleMouseEvent(GlassViewEventHandler.java:416)
	at com.sun.glass.ui.View.handleMouseEvent(View.java:555)
	at com.sun.glass.ui.View.notifyMouse(View.java:937)
	at com.sun.glass.ui.win.WinApplication._runLoop(Native Method)
	at com.sun.glass.ui.win.WinApplication.lambda$null$148(WinApplication.java:191)
	at java.lang.Thread.run(Thread.java:745)
Caused by: java.lang.reflect.InvocationTargetException
	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.lang.reflect.Method.invoke(Method.java:498)
	at sun.reflect.misc.Trampoline.invoke(MethodUtil.java:71)
	at sun.reflect.GeneratedMethodAccessor1.invoke(Unknown Source)
	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.lang.reflect.Method.invoke(Method.java:498)
	at sun.reflect.misc.MethodUtil.invoke(MethodUtil.java:275)
	at javafx.fxml.FXMLLoader$MethodHandler.invoke(FXMLLoader.java:1771)
	... 43 more
Caused by: java.lang.NullPointerException
	at ChatFX.Controller.clearHistory(Controller.java:25)
	at ChatFX.ControllerRoot.clearHistoryRoot(ControllerRoot.java:22)*/


}
