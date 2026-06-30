package icu.samnyan.aqua.api.model.resp.sega.chuni.v2;

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
import static icu.samnyan.aqua.api.model.resp.sega.chuni.v2.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class ProfileResp_setLastPlayDate_18191326655 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term120938;
     Object term121013;

    public ProfileResp_setLastPlayDate_18191326655() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term120938 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.ProfileResp"));
        Object term120981 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term120982 = newInstance(Class.forName("java.time.LocalDate"));
        Object term120986 = newInstance(Class.forName("java.time.LocalTime"));
        Object term120991 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term120992 = newInstance(Class.forName("java.time.LocalDate"));
        Object term120996 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term120938, term120938.getClass(), "userName", "VMCGtPaBtR");
        setIntField(term120938, term120938.getClass(), "level", -2010231622);
        setField(term120938, term120938.getClass(), "exp", "hkZCYOvvsd");
        setLongField(term120938, term120938.getClass(), "point", -8124321383672810307L);
        setLongField(term120938, term120938.getClass(), "totalPoint", 4993477776202138429L);
        setIntField(term120938, term120938.getClass(), "playCount", 192894049);
        setIntField(term120938, term120938.getClass(), "playerRating", -1277107659);
        setIntField(term120938, term120938.getClass(), "highestRating", 506376028);
        setIntField(term120938, term120938.getClass(), "nameplateId", -1468331444);
        setIntField(term120938, term120938.getClass(), "frameId", 1743811445);
        setIntField(term120938, term120938.getClass(), "characterId", 1712898052);
        setIntField(term120938, term120938.getClass(), "trophyId", 29734564);
        setIntField(term120938, term120938.getClass(), "totalMapNum", 1860031844);
        setLongField(term120938, term120938.getClass(), "totalHiScore", 8876040618875695654L);
        setLongField(term120938, term120938.getClass(), "totalBasicHighScore", -6458700098821180318L);
        setLongField(term120938, term120938.getClass(), "totalAdvancedHighScore", -3334548350133176640L);
        setLongField(term120938, term120938.getClass(), "totalExpertHighScore", -5615890364768347380L);
        setLongField(term120938, term120938.getClass(), "totalMasterHighScore", -5910591894509032598L);
        setLongField(term120938, term120938.getClass(), "totalUltimaHighScore", -60355402767553960L);
        setIntField(term120938, term120938.getClass(), "friendCount", 1000740236);
        setIntField(term120982, term120982.getClass(), "year", 2022);
        setShortField(term120982, term120982.getClass(), "month", (short) 1);
        setShortField(term120982, term120982.getClass(), "day", (short) 27);
        setField(term120981, term120981.getClass(), "date", term120982);
        setByteField(term120986, term120986.getClass(), "hour", (byte) 7);
        setByteField(term120986, term120986.getClass(), "minute", (byte) 37);
        setByteField(term120986, term120986.getClass(), "second", (byte) 36);
        setIntField(term120986, term120986.getClass(), "nano", 945138428);
        setField(term120981, term120981.getClass(), "time", term120986);
        setField(term120938, term120938.getClass(), "firstPlayDate", term120981);
        setIntField(term120992, term120992.getClass(), "year", 2029);
        setShortField(term120992, term120992.getClass(), "month", (short) 3);
        setShortField(term120992, term120992.getClass(), "day", (short) 30);
        setField(term120991, term120991.getClass(), "date", term120992);
        setByteField(term120996, term120996.getClass(), "hour", (byte) 20);
        setByteField(term120996, term120996.getClass(), "minute", (byte) 45);
        setByteField(term120996, term120996.getClass(), "second", (byte) 2);
        setIntField(term120996, term120996.getClass(), "nano", 606527471);
        setField(term120991, term120991.getClass(), "time", term120996);
        setField(term120938, term120938.getClass(), "lastPlayDate", term120991);
        setIntField(term120938, term120938.getClass(), "courseClass", 111864037);
        setIntField(term120938, term120938.getClass(), "overPowerPoint", -1303206880);
        setIntField(term120938, term120938.getClass(), "overPowerRate", -575120165);
        setIntField(term120938, term120938.getClass(), "mapIconId", -904067839);
        setIntField(term120938, term120938.getClass(), "voiceId", 846987687);
        setIntField(term120938, term120938.getClass(), "avatarWear", -1263166279);
        setIntField(term120938, term120938.getClass(), "avatarHead", 1510851763);
        setIntField(term120938, term120938.getClass(), "avatarFace", 1817902659);
        setIntField(term120938, term120938.getClass(), "avatarSkin", 968186243);
        setIntField(term120938, term120938.getClass(), "avatarItem", -276385661);
        setIntField(term120938, term120938.getClass(), "avatarFront", -806664344);
        setIntField(term120938, term120938.getClass(), "avatarBack", -1545807724);
        term121013 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term121014 = newInstance(Class.forName("java.time.LocalDate"));
        Object term121018 = newInstance(Class.forName("java.time.LocalTime"));
        setIntField(term121014, term121014.getClass(), "year", 2010);
        setShortField(term121014, term121014.getClass(), "month", (short) 2);
        setShortField(term121014, term121014.getClass(), "day", (short) 7);
        setField(term121013, term121013.getClass(), "date", term121014);
        setByteField(term121018, term121018.getClass(), "hour", (byte) 16);
        setByteField(term121018, term121018.getClass(), "minute", (byte) 12);
        setByteField(term121018, term121018.getClass(), "second", (byte) 58);
        setIntField(term121018, term121018.getClass(), "nano", 846253819);
        setField(term121013, term121013.getClass(), "time", term121018);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.ProfileResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.time.LocalDateTime");
        Object[] args = new Object[1];
        args[0] = term121013;
        callMethod(klass, "setLastPlayDate", argTypes, term120938, args);
    }

};


