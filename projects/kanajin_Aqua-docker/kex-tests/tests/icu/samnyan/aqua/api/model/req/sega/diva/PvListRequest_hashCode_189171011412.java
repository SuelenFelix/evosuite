package icu.samnyan.aqua.api.model.req.sega.diva;

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
import static icu.samnyan.aqua.api.model.req.sega.diva.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.ArrayList;

public class PvListRequest_hashCode_189171011412 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term402048;

    public PvListRequest_hashCode_189171011412() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term402061 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.PvListEntry"));
        Object term402065 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.DatePair"));
        Object term402066 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.DatePair"));
        setIntField(term402061, term402061.getClass(), "PVID", -776594269);
        setIntField(term402061, term402061.getClass(), "Version", 564033911);
        setIntField(term402061, term402061.getClass(), "Edition", -54989345);
        setField(term402065, term402065.getClass(), "Start", null);
        setField(term402065, term402065.getClass(), "End", null);
        setField(term402061, term402061.getClass(), "AdvDemo", term402065);
        setField(term402066, term402066.getClass(), "Start", null);
        setField(term402066, term402066.getClass(), "End", null);
        setField(term402061, term402061.getClass(), "Playable", term402066);
        ArrayList term402059 = new ArrayList();
        ((ArrayList) term402059).add(term402061);
        Object term402071 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.PvListEntry"));
        Object term402075 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.DatePair"));
        Object term402076 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.DatePair"));
        setIntField(term402071, term402071.getClass(), "PVID", 32529830);
        setIntField(term402071, term402071.getClass(), "Version", -1737569600);
        setIntField(term402071, term402071.getClass(), "Edition", 237126816);
        setField(term402075, term402075.getClass(), "Start", null);
        setField(term402075, term402075.getClass(), "End", null);
        setField(term402071, term402071.getClass(), "AdvDemo", term402075);
        setField(term402076, term402076.getClass(), "Start", null);
        setField(term402076, term402076.getClass(), "End", null);
        setField(term402071, term402071.getClass(), "Playable", term402076);
        Object term402077 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.PvListEntry"));
        Object term402081 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.DatePair"));
        Object term402082 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.DatePair"));
        setIntField(term402077, term402077.getClass(), "PVID", -2071924709);
        setIntField(term402077, term402077.getClass(), "Version", 1882628546);
        setIntField(term402077, term402077.getClass(), "Edition", -77686129);
        setField(term402081, term402081.getClass(), "Start", null);
        setField(term402081, term402081.getClass(), "End", null);
        setField(term402077, term402077.getClass(), "AdvDemo", term402081);
        setField(term402082, term402082.getClass(), "Start", null);
        setField(term402082, term402082.getClass(), "End", null);
        setField(term402077, term402077.getClass(), "Playable", term402082);
        ArrayList term402069 = new ArrayList();
        ((ArrayList) term402069).add(term402071);
        ((ArrayList) term402069).add(term402077);
        Object term402087 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.PvListEntry"));
        Object term402091 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.DatePair"));
        Object term402092 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.DatePair"));
        setIntField(term402087, term402087.getClass(), "PVID", -24474163);
        setIntField(term402087, term402087.getClass(), "Version", 1259097995);
        setIntField(term402087, term402087.getClass(), "Edition", 2040687627);
        setField(term402091, term402091.getClass(), "Start", null);
        setField(term402091, term402091.getClass(), "End", null);
        setField(term402087, term402087.getClass(), "AdvDemo", term402091);
        setField(term402092, term402092.getClass(), "Start", null);
        setField(term402092, term402092.getClass(), "End", null);
        setField(term402087, term402087.getClass(), "Playable", term402092);
        Object term402093 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.PvListEntry"));
        Object term402097 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.DatePair"));
        Object term402098 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.DatePair"));
        setIntField(term402093, term402093.getClass(), "PVID", 295635163);
        setIntField(term402093, term402093.getClass(), "Version", -335996466);
        setIntField(term402093, term402093.getClass(), "Edition", 2037425256);
        setField(term402097, term402097.getClass(), "Start", null);
        setField(term402097, term402097.getClass(), "End", null);
        setField(term402093, term402093.getClass(), "AdvDemo", term402097);
        setField(term402098, term402098.getClass(), "Start", null);
        setField(term402098, term402098.getClass(), "End", null);
        setField(term402093, term402093.getClass(), "Playable", term402098);
        Object term402099 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.PvListEntry"));
        setIntField(term402099, term402099.getClass(), "PVID", -1172230975);
        setIntField(term402099, term402099.getClass(), "Version", -1688521198);
        setIntField(term402099, term402099.getClass(), "Edition", 805497831);
        setField(term402099, term402099.getClass(), "AdvDemo", term402092);
        setField(term402099, term402099.getClass(), "Playable", term402097);
        Object term402103 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.PvListEntry"));
        setIntField(term402103, term402103.getClass(), "PVID", 469503944);
        setIntField(term402103, term402103.getClass(), "Version", -2146613180);
        setIntField(term402103, term402103.getClass(), "Edition", 1486820428);
        setField(term402103, term402103.getClass(), "AdvDemo", term402065);
        setField(term402103, term402103.getClass(), "Playable", term402082);
        Object term402107 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.PvListEntry"));
        setIntField(term402107, term402107.getClass(), "PVID", -2115078789);
        setIntField(term402107, term402107.getClass(), "Version", -428129468);
        setIntField(term402107, term402107.getClass(), "Edition", -1945325591);
        setField(term402107, term402107.getClass(), "AdvDemo", term402076);
        setField(term402107, term402107.getClass(), "Playable", term402066);
        Object term402111 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.PvListEntry"));
        setIntField(term402111, term402111.getClass(), "PVID", 1943859594);
        setIntField(term402111, term402111.getClass(), "Version", -1166504698);
        setIntField(term402111, term402111.getClass(), "Edition", -974790951);
        setField(term402111, term402111.getClass(), "AdvDemo", term402066);
        setField(term402111, term402111.getClass(), "Playable", term402098);
        Object term402115 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.PvListEntry"));
        setIntField(term402115, term402115.getClass(), "PVID", 973059088);
        setIntField(term402115, term402115.getClass(), "Version", -2100633022);
        setIntField(term402115, term402115.getClass(), "Edition", -914530224);
        setField(term402115, term402115.getClass(), "AdvDemo", term402092);
        setField(term402115, term402115.getClass(), "Playable", term402092);
        ArrayList term402085 = new ArrayList();
        ((ArrayList) term402085).add(term402087);
        ((ArrayList) term402085).add(term402093);
        ((ArrayList) term402085).add(term402099);
        ((ArrayList) term402085).add(term402103);
        ((ArrayList) term402085).add(term402107);
        ((ArrayList) term402085).add(term402111);
        ((ArrayList) term402085).add(term402115);
        ((ArrayList) term402085).add(term402093);
        ArrayList term402121 = new ArrayList();
        ((ArrayList) term402121).add(term402115);
        ((ArrayList) term402121).add(term402107);
        ((ArrayList) term402121).add(term402099);
        ((ArrayList) term402121).add(term402077);
        ((ArrayList) term402121).add(term402093);
        term402048 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.PvListRequest"));
        Object term402049 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term402050 = newInstance(Class.forName("java.time.LocalDate"));
        Object term402054 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term402050, term402050.getClass(), "year", 2016);
        setShortField(term402050, term402050.getClass(), "month", (short) 6);
        setShortField(term402050, term402050.getClass(), "day", (short) 17);
        setField(term402049, term402049.getClass(), "date", term402050);
        setByteField(term402054, term402054.getClass(), "hour", (byte) 13);
        setByteField(term402054, term402054.getClass(), "minute", (byte) 9);
        setByteField(term402054, term402054.getClass(), "second", (byte) 27);
        setIntField(term402054, term402054.getClass(), "nano", 752814005);
        setField(term402049, term402049.getClass(), "time", term402054);
        setField(term402048, term402048.getClass(), "CreationDate", term402049);
        setField(term402048, term402048.getClass(), "Easy", term402059);
        setField(term402048, term402048.getClass(), "Normal", term402069);
        setField(term402048, term402048.getClass(), "Hard", term402085);
        setField(term402048, term402048.getClass(), "Extreme", term402121);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.PvListRequest");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term402048, args);
    }

};


