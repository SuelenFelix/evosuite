package zowe.client.sdk.zosfiles.uss.response;

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
import static zowe.client.sdk.zosfiles.uss.response.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.util.ArrayList;
import java.lang.Object;
import java.lang.Long;

public class UnixFileListResponse_getTotalRows_19508823283 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term673;

    public UnixFileListResponse_getTotalRows_19508823283() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Integer term674 = new Integer(1134449235);
        Integer term676 = new Integer(-883034806);
        Integer term678 = new Integer(1585847225);
        Long term685 = new Long(-7884871963229073324L);
        Long term687 = new Long(-8649738738252714180L);
        Long term690 = new Long(-7278883608542636188L);
        Object term682 = newInstance(Class.forName("zowe.client.sdk.zosfiles.uss.model.UnixFile"));
        setField(term682, term682.getClass(), "name", "");
        setField(term682, term682.getClass(), "mode", "");
        setField(term682, term682.getClass(), "size", term685);
        setField(term682, term682.getClass(), "uid", term687);
        setField(term682, term682.getClass(), "user", "");
        setField(term682, term682.getClass(), "gid", term690);
        setField(term682, term682.getClass(), "group", "");
        setField(term682, term682.getClass(), "mtime", "");
        setField(term682, term682.getClass(), "target", "");
        Long term698 = new Long(-1539859611880912454L);
        Long term700 = new Long(4100236067313034103L);
        Long term703 = new Long(1195529027276497124L);
        Object term695 = newInstance(Class.forName("zowe.client.sdk.zosfiles.uss.model.UnixFile"));
        setField(term695, term695.getClass(), "name", "");
        setField(term695, term695.getClass(), "mode", "");
        setField(term695, term695.getClass(), "size", term698);
        setField(term695, term695.getClass(), "uid", term700);
        setField(term695, term695.getClass(), "user", "");
        setField(term695, term695.getClass(), "gid", term703);
        setField(term695, term695.getClass(), "group", "");
        setField(term695, term695.getClass(), "mtime", "");
        setField(term695, term695.getClass(), "target", "");
        Long term711 = new Long(-2783999800714825789L);
        Long term713 = new Long(4266570509071948633L);
        Long term716 = new Long(-7291742736502427077L);
        Object term708 = newInstance(Class.forName("zowe.client.sdk.zosfiles.uss.model.UnixFile"));
        setField(term708, term708.getClass(), "name", "");
        setField(term708, term708.getClass(), "mode", "");
        setField(term708, term708.getClass(), "size", term711);
        setField(term708, term708.getClass(), "uid", term713);
        setField(term708, term708.getClass(), "user", "");
        setField(term708, term708.getClass(), "gid", term716);
        setField(term708, term708.getClass(), "group", "");
        setField(term708, term708.getClass(), "mtime", "");
        setField(term708, term708.getClass(), "target", "");
        Long term724 = new Long(-8121849829073967555L);
        Long term726 = new Long(5219030281405653303L);
        Long term729 = new Long(-8471550651709805183L);
        Object term721 = newInstance(Class.forName("zowe.client.sdk.zosfiles.uss.model.UnixFile"));
        setField(term721, term721.getClass(), "name", "");
        setField(term721, term721.getClass(), "mode", "");
        setField(term721, term721.getClass(), "size", term724);
        setField(term721, term721.getClass(), "uid", term726);
        setField(term721, term721.getClass(), "user", "");
        setField(term721, term721.getClass(), "gid", term729);
        setField(term721, term721.getClass(), "group", "");
        setField(term721, term721.getClass(), "mtime", "");
        setField(term721, term721.getClass(), "target", "");
        Long term737 = new Long(-948292411727204525L);
        Long term739 = new Long(-8892586408602479513L);
        Long term742 = new Long(4616440478358528406L);
        Object term734 = newInstance(Class.forName("zowe.client.sdk.zosfiles.uss.model.UnixFile"));
        setField(term734, term734.getClass(), "name", "");
        setField(term734, term734.getClass(), "mode", "");
        setField(term734, term734.getClass(), "size", term737);
        setField(term734, term734.getClass(), "uid", term739);
        setField(term734, term734.getClass(), "user", "");
        setField(term734, term734.getClass(), "gid", term742);
        setField(term734, term734.getClass(), "group", "");
        setField(term734, term734.getClass(), "mtime", "");
        setField(term734, term734.getClass(), "target", "");
        Long term750 = new Long(3427570961451840069L);
        Long term752 = new Long(4502292577098212311L);
        Long term755 = new Long(-3730936709704460408L);
        Object term747 = newInstance(Class.forName("zowe.client.sdk.zosfiles.uss.model.UnixFile"));
        setField(term747, term747.getClass(), "name", "");
        setField(term747, term747.getClass(), "mode", "");
        setField(term747, term747.getClass(), "size", term750);
        setField(term747, term747.getClass(), "uid", term752);
        setField(term747, term747.getClass(), "user", "");
        setField(term747, term747.getClass(), "gid", term755);
        setField(term747, term747.getClass(), "group", "");
        setField(term747, term747.getClass(), "mtime", "");
        setField(term747, term747.getClass(), "target", "");
        ArrayList term680 = new ArrayList();
        ((ArrayList) term680).add(term682);
        ((ArrayList) term680).add(term695);
        ((ArrayList) term680).add(term708);
        ((ArrayList) term680).add(term721);
        ((ArrayList) term680).add(term734);
        ((ArrayList) term680).add(term747);
        term673 = newInstance(Class.forName("zowe.client.sdk.zosfiles.uss.response.UnixFileListResponse"));
        setField(term673, term673.getClass(), "jsonVersion", term674);
        setField(term673, term673.getClass(), "returnedRows", term676);
        setField(term673, term673.getClass(), "totalRows", term678);
        setField(term673, term673.getClass(), "items", term680);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("zowe.client.sdk.zosfiles.uss.response.UnixFileListResponse");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTotalRows", argTypes, term673, args);
    }

};


