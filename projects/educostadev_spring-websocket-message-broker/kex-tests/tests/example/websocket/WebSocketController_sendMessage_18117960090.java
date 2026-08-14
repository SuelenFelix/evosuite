package example.websocket;

import java.lang.Throwable;
import java.lang.IllegalStateException;
import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.Timeout;
import java.util.concurrent.TimeUnit;
import org.junit.Before;
import java.lang.Class;
import java.lang.reflect.Method;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import static example.websocket.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class WebSocketController_sendMessage_18117960090 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;
     Object term26;

    public WebSocketController_sendMessage_18117960090() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1 = newInstance(Class.forName("example.websocket.WebSocketController"));
        setField(term1, term1.getClass(), "webSocketService", null);
        term26 = newInstance(Class.forName("example.websocket.WebSocketController$WebSocketRequestMessage"));
        setField(term26, term26.getClass(), "messageContent", "MuLcgQHgqz");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("example.websocket.WebSocketController");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("java.security.Principal");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("java.lang.String");
        argTypes[3] = Class.forName("example.websocket.WebSocketController$WebSocketRequestMessage");
        Object[] args = new Object[4];
        args[0] = null;
        args[1] = "PAEBtnZtTD";
        args[2] = "sjlJAEtRrb";
        args[3] = term26;
        callMethod(klass, "sendMessage", argTypes, term1, args);
    }

};


