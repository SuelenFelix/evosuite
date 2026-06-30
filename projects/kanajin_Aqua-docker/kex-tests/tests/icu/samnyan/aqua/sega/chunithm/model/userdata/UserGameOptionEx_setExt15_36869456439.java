package icu.samnyan.aqua.sega.chunithm.model.userdata;

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
import static icu.samnyan.aqua.sega.chunithm.model.userdata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Long;
import java.lang.Integer;

public class UserGameOptionEx_setExt15_36869456439 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term327511;
     Object term327809;

    public UserGameOptionEx_setExt15_36869456439() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term327517 = new Long(6801904611028883308L);
        term327511 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserGameOptionEx"));
        Object term327513 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        Object term327515 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term327531 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term327532 = newInstance(Class.forName("java.time.LocalDate"));
        Object term327536 = newInstance(Class.forName("java.time.LocalTime"));
        Object term327541 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term327542 = newInstance(Class.forName("java.time.LocalDate"));
        Object term327546 = newInstance(Class.forName("java.time.LocalTime"));
        Object term327563 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term327564 = newInstance(Class.forName("java.time.LocalDate"));
        Object term327568 = newInstance(Class.forName("java.time.LocalTime"));
        Object term327624 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term327625 = newInstance(Class.forName("java.time.LocalDate"));
        Object term327629 = newInstance(Class.forName("java.time.LocalTime"));
        Object term327672 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term327673 = newInstance(Class.forName("java.time.LocalDate"));
        Object term327677 = newInstance(Class.forName("java.time.LocalTime"));
        Object term327718 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term327719 = newInstance(Class.forName("java.time.LocalDate"));
        Object term327723 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term327511, term327511.getClass(), "id", -7616963718648168070L);
        setLongField(term327513, term327513.getClass(), "id", 7513193376333191949L);
        setLongField(term327515, term327515.getClass(), "id", 4190534065690990308L);
        setField(term327515, term327515.getClass(), "extId", term327517);
        setField(term327515, term327515.getClass(), "luid", "mPJNZAkiwl");
        setIntField(term327532, term327532.getClass(), "year", 2021);
        setShortField(term327532, term327532.getClass(), "month", (short) 4);
        setShortField(term327532, term327532.getClass(), "day", (short) 6);
        setField(term327531, term327531.getClass(), "date", term327532);
        setByteField(term327536, term327536.getClass(), "hour", (byte) 9);
        setByteField(term327536, term327536.getClass(), "minute", (byte) 4);
        setByteField(term327536, term327536.getClass(), "second", (byte) 27);
        setIntField(term327536, term327536.getClass(), "nano", 212628700);
        setField(term327531, term327531.getClass(), "time", term327536);
        setField(term327515, term327515.getClass(), "registerTime", term327531);
        setIntField(term327542, term327542.getClass(), "year", 2014);
        setShortField(term327542, term327542.getClass(), "month", (short) 8);
        setShortField(term327542, term327542.getClass(), "day", (short) 9);
        setField(term327541, term327541.getClass(), "date", term327542);
        setByteField(term327546, term327546.getClass(), "hour", (byte) 9);
        setByteField(term327546, term327546.getClass(), "minute", (byte) 34);
        setByteField(term327546, term327546.getClass(), "second", (byte) 26);
        setIntField(term327546, term327546.getClass(), "nano", 949094114);
        setField(term327541, term327541.getClass(), "time", term327546);
        setField(term327515, term327515.getClass(), "accessTime", term327541);
        setField(term327513, term327513.getClass(), "card", term327515);
        setField(term327513, term327513.getClass(), "userName", "RNQPquGEUU");
        setIntField(term327564, term327564.getClass(), "year", 2012);
        setShortField(term327564, term327564.getClass(), "month", (short) 3);
        setShortField(term327564, term327564.getClass(), "day", (short) 15);
        setField(term327563, term327563.getClass(), "date", term327564);
        setByteField(term327568, term327568.getClass(), "hour", (byte) 18);
        setByteField(term327568, term327568.getClass(), "minute", (byte) 47);
        setByteField(term327568, term327568.getClass(), "second", (byte) 55);
        setIntField(term327568, term327568.getClass(), "nano", 733416809);
        setField(term327563, term327563.getClass(), "time", term327568);
        setField(term327513, term327513.getClass(), "lastLoginDate", term327563);
        setBooleanField(term327513, term327513.getClass(), "isWebJoin", false);
        setField(term327513, term327513.getClass(), "webLimitDate", "KKEVepiIpV");
        setIntField(term327513, term327513.getClass(), "level", -1028873607);
        setIntField(term327513, term327513.getClass(), "reincarnationNum", 315251699);
        setField(term327513, term327513.getClass(), "exp", "acFpjOqFxM");
        setLongField(term327513, term327513.getClass(), "point", 5269765578770913317L);
        setLongField(term327513, term327513.getClass(), "totalPoint", 7345544463513017748L);
        setIntField(term327513, term327513.getClass(), "playCount", 507924600);
        setIntField(term327513, term327513.getClass(), "multiPlayCount", -2073979004);
        setIntField(term327513, term327513.getClass(), "multiWinCount", -137484132);
        setIntField(term327513, term327513.getClass(), "requestResCount", -836521071);
        setIntField(term327513, term327513.getClass(), "acceptResCount", -1451275875);
        setIntField(term327513, term327513.getClass(), "successResCount", -1232558510);
        setIntField(term327513, term327513.getClass(), "playerRating", -1593478425);
        setIntField(term327513, term327513.getClass(), "highestRating", -1069502098);
        setIntField(term327513, term327513.getClass(), "nameplateId", 1543953179);
        setIntField(term327513, term327513.getClass(), "frameId", 1411978050);
        setIntField(term327513, term327513.getClass(), "characterId", 581571023);
        setIntField(term327513, term327513.getClass(), "trophyId", -150922197);
        setIntField(term327513, term327513.getClass(), "playedTutorialBit", 374168654);
        setIntField(term327513, term327513.getClass(), "firstTutorialCancelNum", 550576763);
        setIntField(term327513, term327513.getClass(), "masterTutorialCancelNum", 1169615135);
        setIntField(term327513, term327513.getClass(), "totalRepertoireCount", 936896201);
        setIntField(term327513, term327513.getClass(), "totalMapNum", -577135458);
        setLongField(term327513, term327513.getClass(), "totalHiScore", 3719699734794738508L);
        setLongField(term327513, term327513.getClass(), "totalBasicHighScore", -4703905308104862314L);
        setLongField(term327513, term327513.getClass(), "totalAdvancedHighScore", 33430713669591782L);
        setLongField(term327513, term327513.getClass(), "totalExpertHighScore", 7155943267569250580L);
        setLongField(term327513, term327513.getClass(), "totalMasterHighScore", -2995857644224632258L);
        setIntField(term327625, term327625.getClass(), "year", 2029);
        setShortField(term327625, term327625.getClass(), "month", (short) 3);
        setShortField(term327625, term327625.getClass(), "day", (short) 11);
        setField(term327624, term327624.getClass(), "date", term327625);
        setByteField(term327629, term327629.getClass(), "hour", (byte) 21);
        setByteField(term327629, term327629.getClass(), "minute", (byte) 51);
        setByteField(term327629, term327629.getClass(), "second", (byte) 15);
        setIntField(term327629, term327629.getClass(), "nano", 597956893);
        setField(term327624, term327624.getClass(), "time", term327629);
        setField(term327513, term327513.getClass(), "eventWatchedDate", term327624);
        setIntField(term327513, term327513.getClass(), "friendCount", -2015362123);
        setBooleanField(term327513, term327513.getClass(), "isMaimai", true);
        setField(term327513, term327513.getClass(), "firstGameId", "JKrIhwugSB");
        setField(term327513, term327513.getClass(), "firstRomVersion", "xfIshpKhxl");
        setField(term327513, term327513.getClass(), "firstDataVersion", "JwAMbyDsCd");
        setIntField(term327673, term327673.getClass(), "year", 2017);
        setShortField(term327673, term327673.getClass(), "month", (short) 6);
        setShortField(term327673, term327673.getClass(), "day", (short) 2);
        setField(term327672, term327672.getClass(), "date", term327673);
        setByteField(term327677, term327677.getClass(), "hour", (byte) 19);
        setByteField(term327677, term327677.getClass(), "minute", (byte) 42);
        setByteField(term327677, term327677.getClass(), "second", (byte) 16);
        setIntField(term327677, term327677.getClass(), "nano", 655897270);
        setField(term327672, term327672.getClass(), "time", term327677);
        setField(term327513, term327513.getClass(), "firstPlayDate", term327672);
        setField(term327513, term327513.getClass(), "lastGameId", "jjiEzphWfP");
        setField(term327513, term327513.getClass(), "lastRomVersion", "vfJNCQdABx");
        setField(term327513, term327513.getClass(), "lastDataVersion", "UaOaphsPNu");
        setIntField(term327719, term327719.getClass(), "year", 2027);
        setShortField(term327719, term327719.getClass(), "month", (short) 6);
        setShortField(term327719, term327719.getClass(), "day", (short) 26);
        setField(term327718, term327718.getClass(), "date", term327719);
        setByteField(term327723, term327723.getClass(), "hour", (byte) 3);
        setByteField(term327723, term327723.getClass(), "minute", (byte) 42);
        setByteField(term327723, term327723.getClass(), "second", (byte) 39);
        setIntField(term327723, term327723.getClass(), "nano", 640546680);
        setField(term327718, term327718.getClass(), "time", term327723);
        setField(term327513, term327513.getClass(), "lastPlayDate", term327718);
        setIntField(term327513, term327513.getClass(), "lastPlaceId", 1512483063);
        setField(term327513, term327513.getClass(), "lastPlaceName", "PVNHLparYg");
        setField(term327513, term327513.getClass(), "lastRegionId", "lVuSpxrheO");
        setField(term327513, term327513.getClass(), "lastRegionName", "yqIHgqJlRm");
        setField(term327513, term327513.getClass(), "lastAllNetId", "IdqtTIZzUa");
        setField(term327513, term327513.getClass(), "lastClientId", "mAkJuHJPpR");
        setField(term327511, term327511.getClass(), "user", term327513);
        setIntField(term327511, term327511.getClass(), "ext1", -1114353828);
        setIntField(term327511, term327511.getClass(), "ext2", -1036997079);
        setIntField(term327511, term327511.getClass(), "ext3", 1656123916);
        setIntField(term327511, term327511.getClass(), "ext4", 2024821526);
        setIntField(term327511, term327511.getClass(), "ext5", 1745990909);
        setIntField(term327511, term327511.getClass(), "ext6", -61000033);
        setIntField(term327511, term327511.getClass(), "ext7", 833682710);
        setIntField(term327511, term327511.getClass(), "ext8", 1500532827);
        setIntField(term327511, term327511.getClass(), "ext9", 1496996100);
        setIntField(term327511, term327511.getClass(), "ext10", 1948281454);
        setIntField(term327511, term327511.getClass(), "ext11", -1588244681);
        setIntField(term327511, term327511.getClass(), "ext12", 1657723528);
        setIntField(term327511, term327511.getClass(), "ext13", -925335689);
        setIntField(term327511, term327511.getClass(), "ext14", 1465194014);
        setIntField(term327511, term327511.getClass(), "ext15", 1373439283);
        setIntField(term327511, term327511.getClass(), "ext16", 1908194889);
        setIntField(term327511, term327511.getClass(), "ext17", 812950204);
        setIntField(term327511, term327511.getClass(), "ext18", 732912125);
        setIntField(term327511, term327511.getClass(), "ext19", 1994255108);
        setIntField(term327511, term327511.getClass(), "ext20", -429147788);
        term327809 = new Integer(959884950);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserGameOptionEx");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term327809;
        callMethod(klass, "setExt15", argTypes, term327511, args);
    }

};


