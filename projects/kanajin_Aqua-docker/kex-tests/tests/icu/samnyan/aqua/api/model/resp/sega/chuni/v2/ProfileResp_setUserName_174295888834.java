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

public class ProfileResp_setUserName_174295888834 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term118853;

    public ProfileResp_setUserName_174295888834() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term118853 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.ProfileResp"));
        Object term118896 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term118897 = newInstance(Class.forName("java.time.LocalDate"));
        Object term118901 = newInstance(Class.forName("java.time.LocalTime"));
        Object term118906 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term118907 = newInstance(Class.forName("java.time.LocalDate"));
        Object term118911 = newInstance(Class.forName("java.time.LocalTime"));
        setField(term118853, term118853.getClass(), "userName", "AKmeKdDdvP");
        setIntField(term118853, term118853.getClass(), "level", 380366937);
        setField(term118853, term118853.getClass(), "exp", "kqtcoMBiTN");
        setLongField(term118853, term118853.getClass(), "point", -382033077003957775L);
        setLongField(term118853, term118853.getClass(), "totalPoint", -7039393188499276626L);
        setIntField(term118853, term118853.getClass(), "playCount", 1386089732);
        setIntField(term118853, term118853.getClass(), "playerRating", -494935523);
        setIntField(term118853, term118853.getClass(), "highestRating", -1645804073);
        setIntField(term118853, term118853.getClass(), "nameplateId", 1442481095);
        setIntField(term118853, term118853.getClass(), "frameId", 793855911);
        setIntField(term118853, term118853.getClass(), "characterId", -1100264233);
        setIntField(term118853, term118853.getClass(), "trophyId", 1620793659);
        setIntField(term118853, term118853.getClass(), "totalMapNum", 1640954226);
        setLongField(term118853, term118853.getClass(), "totalHiScore", 5335480018574102159L);
        setLongField(term118853, term118853.getClass(), "totalBasicHighScore", -8598034656647189539L);
        setLongField(term118853, term118853.getClass(), "totalAdvancedHighScore", -2322836104787041994L);
        setLongField(term118853, term118853.getClass(), "totalExpertHighScore", -3184087865960753750L);
        setLongField(term118853, term118853.getClass(), "totalMasterHighScore", 1368967421869882287L);
        setLongField(term118853, term118853.getClass(), "totalUltimaHighScore", -4353084055559864019L);
        setIntField(term118853, term118853.getClass(), "friendCount", -1503778726);
        setIntField(term118897, term118897.getClass(), "year", 2012);
        setShortField(term118897, term118897.getClass(), "month", (short) 3);
        setShortField(term118897, term118897.getClass(), "day", (short) 19);
        setField(term118896, term118896.getClass(), "date", term118897);
        setByteField(term118901, term118901.getClass(), "hour", (byte) 6);
        setByteField(term118901, term118901.getClass(), "minute", (byte) 38);
        setByteField(term118901, term118901.getClass(), "second", (byte) 20);
        setIntField(term118901, term118901.getClass(), "nano", 630166836);
        setField(term118896, term118896.getClass(), "time", term118901);
        setField(term118853, term118853.getClass(), "firstPlayDate", term118896);
        setIntField(term118907, term118907.getClass(), "year", 2011);
        setShortField(term118907, term118907.getClass(), "month", (short) 3);
        setShortField(term118907, term118907.getClass(), "day", (short) 2);
        setField(term118906, term118906.getClass(), "date", term118907);
        setByteField(term118911, term118911.getClass(), "hour", (byte) 23);
        setByteField(term118911, term118911.getClass(), "minute", (byte) 21);
        setByteField(term118911, term118911.getClass(), "second", (byte) 52);
        setIntField(term118911, term118911.getClass(), "nano", 230415346);
        setField(term118906, term118906.getClass(), "time", term118911);
        setField(term118853, term118853.getClass(), "lastPlayDate", term118906);
        setIntField(term118853, term118853.getClass(), "courseClass", 1580289536);
        setIntField(term118853, term118853.getClass(), "overPowerPoint", 329678487);
        setIntField(term118853, term118853.getClass(), "overPowerRate", 1974905328);
        setIntField(term118853, term118853.getClass(), "mapIconId", 2043786096);
        setIntField(term118853, term118853.getClass(), "voiceId", -2005880999);
        setIntField(term118853, term118853.getClass(), "avatarWear", -708574737);
        setIntField(term118853, term118853.getClass(), "avatarHead", 523202188);
        setIntField(term118853, term118853.getClass(), "avatarFace", -73009098);
        setIntField(term118853, term118853.getClass(), "avatarSkin", -403968039);
        setIntField(term118853, term118853.getClass(), "avatarItem", -1167154792);
        setIntField(term118853, term118853.getClass(), "avatarFront", -542608620);
        setIntField(term118853, term118853.getClass(), "avatarBack", 202367027);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.chuni.v2.ProfileResp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "JpjXzcwToy";
        callMethod(klass, "setUserName", argTypes, term118853, args);
    }

};


