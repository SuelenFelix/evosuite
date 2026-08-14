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

public class PvListRequest_canEqual_63886081011 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term401970;
     Object term402047;

    public PvListRequest_canEqual_63886081011() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term401983 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.PvListEntry"));
        Object term401987 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.DatePair"));
        Object term401988 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.DatePair"));
        setIntField(term401983, term401983.getClass(), "PVID", -1023562453);
        setIntField(term401983, term401983.getClass(), "Version", -760757913);
        setIntField(term401983, term401983.getClass(), "Edition", 214576987);
        setField(term401987, term401987.getClass(), "Start", null);
        setField(term401987, term401987.getClass(), "End", null);
        setField(term401983, term401983.getClass(), "AdvDemo", term401987);
        setField(term401988, term401988.getClass(), "Start", null);
        setField(term401988, term401988.getClass(), "End", null);
        setField(term401983, term401983.getClass(), "Playable", term401988);
        ArrayList term401981 = new ArrayList();
        ((ArrayList) term401981).add(term401983);
        Object term401993 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.PvListEntry"));
        Object term401997 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.DatePair"));
        Object term401998 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.DatePair"));
        setIntField(term401993, term401993.getClass(), "PVID", -1386046946);
        setIntField(term401993, term401993.getClass(), "Version", 966678755);
        setIntField(term401993, term401993.getClass(), "Edition", -1708646220);
        setField(term401997, term401997.getClass(), "Start", null);
        setField(term401997, term401997.getClass(), "End", null);
        setField(term401993, term401993.getClass(), "AdvDemo", term401997);
        setField(term401998, term401998.getClass(), "Start", null);
        setField(term401998, term401998.getClass(), "End", null);
        setField(term401993, term401993.getClass(), "Playable", term401998);
        Object term401999 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.PvListEntry"));
        Object term402003 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.DatePair"));
        Object term402004 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.DatePair"));
        setIntField(term401999, term401999.getClass(), "PVID", 1136761253);
        setIntField(term401999, term401999.getClass(), "Version", 1081752022);
        setIntField(term401999, term401999.getClass(), "Edition", -1024583441);
        setField(term402003, term402003.getClass(), "Start", null);
        setField(term402003, term402003.getClass(), "End", null);
        setField(term401999, term401999.getClass(), "AdvDemo", term402003);
        setField(term402004, term402004.getClass(), "Start", null);
        setField(term402004, term402004.getClass(), "End", null);
        setField(term401999, term401999.getClass(), "Playable", term402004);
        Object term402005 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.PvListEntry"));
        Object term402009 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.DatePair"));
        Object term402010 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.DatePair"));
        setIntField(term402005, term402005.getClass(), "PVID", -732683774);
        setIntField(term402005, term402005.getClass(), "Version", 1683160382);
        setIntField(term402005, term402005.getClass(), "Edition", -837567123);
        setField(term402009, term402009.getClass(), "Start", null);
        setField(term402009, term402009.getClass(), "End", null);
        setField(term402005, term402005.getClass(), "AdvDemo", term402009);
        setField(term402010, term402010.getClass(), "Start", null);
        setField(term402010, term402010.getClass(), "End", null);
        setField(term402005, term402005.getClass(), "Playable", term402010);
        Object term402011 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.PvListEntry"));
        Object term402015 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.DatePair"));
        Object term402016 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.DatePair"));
        setIntField(term402011, term402011.getClass(), "PVID", 709708710);
        setIntField(term402011, term402011.getClass(), "Version", 211190867);
        setIntField(term402011, term402011.getClass(), "Edition", 240249058);
        setField(term402015, term402015.getClass(), "Start", null);
        setField(term402015, term402015.getClass(), "End", null);
        setField(term402011, term402011.getClass(), "AdvDemo", term402015);
        setField(term402016, term402016.getClass(), "Start", null);
        setField(term402016, term402016.getClass(), "End", null);
        setField(term402011, term402011.getClass(), "Playable", term402016);
        Object term402017 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.PvListEntry"));
        setIntField(term402017, term402017.getClass(), "PVID", -1854065829);
        setIntField(term402017, term402017.getClass(), "Version", 28204059);
        setIntField(term402017, term402017.getClass(), "Edition", -1931517647);
        setField(term402017, term402017.getClass(), "AdvDemo", term402010);
        setField(term402017, term402017.getClass(), "Playable", term402015);
        Object term402021 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.PvListEntry"));
        setIntField(term402021, term402021.getClass(), "PVID", -1806658600);
        setIntField(term402021, term402021.getClass(), "Version", -239610472);
        setIntField(term402021, term402021.getClass(), "Edition", -1645991994);
        setField(term402021, term402021.getClass(), "AdvDemo", term401987);
        setField(term402021, term402021.getClass(), "Playable", term402004);
        Object term402025 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.PvListEntry"));
        setIntField(term402025, term402025.getClass(), "PVID", 629590901);
        setIntField(term402025, term402025.getClass(), "Version", -180357583);
        setIntField(term402025, term402025.getClass(), "Edition", -148932967);
        setField(term402025, term402025.getClass(), "AdvDemo", term401998);
        setField(term402025, term402025.getClass(), "Playable", term401988);
        Object term402029 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.PvListEntry"));
        setIntField(term402029, term402029.getClass(), "PVID", -1547789725);
        setIntField(term402029, term402029.getClass(), "Version", 1689913190);
        setIntField(term402029, term402029.getClass(), "Edition", -1597857459);
        setField(term402029, term402029.getClass(), "AdvDemo", term401988);
        setField(term402029, term402029.getClass(), "Playable", term402016);
        Object term402033 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.PvListEntry"));
        setIntField(term402033, term402033.getClass(), "PVID", 1659324794);
        setIntField(term402033, term402033.getClass(), "Version", -872766438);
        setIntField(term402033, term402033.getClass(), "Edition", -1141133307);
        setField(term402033, term402033.getClass(), "AdvDemo", term402010);
        setField(term402033, term402033.getClass(), "Playable", term402010);
        ArrayList term401991 = new ArrayList();
        ((ArrayList) term401991).add(term401993);
        ((ArrayList) term401991).add(term401999);
        ((ArrayList) term401991).add(term402005);
        ((ArrayList) term401991).add(term402011);
        ((ArrayList) term401991).add(term402017);
        ((ArrayList) term401991).add(term402021);
        ((ArrayList) term401991).add(term402025);
        ((ArrayList) term401991).add(term402029);
        ((ArrayList) term401991).add(term402033);
        ArrayList term402039 = new ArrayList();
        ((ArrayList) term402039).add(term402011);
        ((ArrayList) term402039).add(term402033);
        ((ArrayList) term402039).add(term402025);
        ((ArrayList) term402039).add(term402017);
        ((ArrayList) term402039).add(term401999);
        ((ArrayList) term402039).add(term402011);
        ArrayList term402043 = new ArrayList();
        ((ArrayList) term402043).add(term402025);
        ((ArrayList) term402043).add(term402033);
        ((ArrayList) term402043).add(term402033);
        ((ArrayList) term402043).add(term402005);
        term401970 = newInstance(Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.PvListRequest"));
        Object term401971 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term401972 = newInstance(Class.forName("java.time.LocalDate"));
        Object term401976 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term401972, term401972.getClass(), "year", 2010);
        setShortField(term401972, term401972.getClass(), "month", (short) 1);
        setShortField(term401972, term401972.getClass(), "day", (short) 26);
        setField(term401971, term401971.getClass(), "date", term401972);
        setByteField(term401976, term401976.getClass(), "hour", (byte) 15);
        setByteField(term401976, term401976.getClass(), "minute", (byte) 20);
        setByteField(term401976, term401976.getClass(), "second", (byte) 0);
        setIntField(term401976, term401976.getClass(), "nano", 894433152);
        setField(term401971, term401971.getClass(), "time", term401976);
        setField(term401970, term401970.getClass(), "CreationDate", term401971);
        setField(term401970, term401970.getClass(), "Easy", term401981);
        setField(term401970, term401970.getClass(), "Normal", term401991);
        setField(term401970, term401970.getClass(), "Hard", term402039);
        setField(term401970, term401970.getClass(), "Extreme", term402043);
        term402047 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.req.sega.diva.PvListRequest");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term402047;
        callMethod(klass, "canEqual", argTypes, term401970, args);
    }

};


