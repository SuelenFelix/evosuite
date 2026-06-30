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

public class UserData_getTotalExpertHighScore_12992008331 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term142587;

    public UserData_getTotalExpertHighScore_12992008331() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term142591 = new Long(-8477368071089201577L);
        term142587 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        Object term142589 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term142605 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term142606 = newInstance(Class.forName("java.time.LocalDate"));
        Object term142610 = newInstance(Class.forName("java.time.LocalTime"));
        Object term142615 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term142616 = newInstance(Class.forName("java.time.LocalDate"));
        Object term142620 = newInstance(Class.forName("java.time.LocalTime"));
        Object term142637 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term142638 = newInstance(Class.forName("java.time.LocalDate"));
        Object term142642 = newInstance(Class.forName("java.time.LocalTime"));
        Object term142698 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term142699 = newInstance(Class.forName("java.time.LocalDate"));
        Object term142703 = newInstance(Class.forName("java.time.LocalTime"));
        Object term142746 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term142747 = newInstance(Class.forName("java.time.LocalDate"));
        Object term142751 = newInstance(Class.forName("java.time.LocalTime"));
        Object term142792 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term142793 = newInstance(Class.forName("java.time.LocalDate"));
        Object term142797 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term142587, term142587.getClass(), "id", 8113209483343094504L);
        setLongField(term142589, term142589.getClass(), "id", 8607092516036150255L);
        setField(term142589, term142589.getClass(), "extId", term142591);
        setField(term142589, term142589.getClass(), "luid", "ctTLYxopUg");
        setIntField(term142606, term142606.getClass(), "year", 2010);
        setShortField(term142606, term142606.getClass(), "month", (short) 12);
        setShortField(term142606, term142606.getClass(), "day", (short) 4);
        setField(term142605, term142605.getClass(), "date", term142606);
        setByteField(term142610, term142610.getClass(), "hour", (byte) 3);
        setByteField(term142610, term142610.getClass(), "minute", (byte) 40);
        setByteField(term142610, term142610.getClass(), "second", (byte) 22);
        setIntField(term142610, term142610.getClass(), "nano", 836088010);
        setField(term142605, term142605.getClass(), "time", term142610);
        setField(term142589, term142589.getClass(), "registerTime", term142605);
        setIntField(term142616, term142616.getClass(), "year", 2016);
        setShortField(term142616, term142616.getClass(), "month", (short) 3);
        setShortField(term142616, term142616.getClass(), "day", (short) 29);
        setField(term142615, term142615.getClass(), "date", term142616);
        setByteField(term142620, term142620.getClass(), "hour", (byte) 2);
        setByteField(term142620, term142620.getClass(), "minute", (byte) 35);
        setByteField(term142620, term142620.getClass(), "second", (byte) 11);
        setIntField(term142620, term142620.getClass(), "nano", 95926908);
        setField(term142615, term142615.getClass(), "time", term142620);
        setField(term142589, term142589.getClass(), "accessTime", term142615);
        setField(term142587, term142587.getClass(), "card", term142589);
        setField(term142587, term142587.getClass(), "userName", "tccghjUmdc");
        setIntField(term142638, term142638.getClass(), "year", 2012);
        setShortField(term142638, term142638.getClass(), "month", (short) 12);
        setShortField(term142638, term142638.getClass(), "day", (short) 22);
        setField(term142637, term142637.getClass(), "date", term142638);
        setByteField(term142642, term142642.getClass(), "hour", (byte) 19);
        setByteField(term142642, term142642.getClass(), "minute", (byte) 18);
        setByteField(term142642, term142642.getClass(), "second", (byte) 35);
        setIntField(term142642, term142642.getClass(), "nano", 300107487);
        setField(term142637, term142637.getClass(), "time", term142642);
        setField(term142587, term142587.getClass(), "lastLoginDate", term142637);
        setBooleanField(term142587, term142587.getClass(), "isWebJoin", true);
        setField(term142587, term142587.getClass(), "webLimitDate", "iCaFATAsAC");
        setIntField(term142587, term142587.getClass(), "level", 1578242981);
        setIntField(term142587, term142587.getClass(), "reincarnationNum", 243686870);
        setField(term142587, term142587.getClass(), "exp", "HPWJMPlVFI");
        setLongField(term142587, term142587.getClass(), "point", 9029917960021632743L);
        setLongField(term142587, term142587.getClass(), "totalPoint", -7269143746258679330L);
        setIntField(term142587, term142587.getClass(), "playCount", -220352077);
        setIntField(term142587, term142587.getClass(), "multiPlayCount", -248969650);
        setIntField(term142587, term142587.getClass(), "multiWinCount", 33246852);
        setIntField(term142587, term142587.getClass(), "requestResCount", 1051049624);
        setIntField(term142587, term142587.getClass(), "acceptResCount", 23316800);
        setIntField(term142587, term142587.getClass(), "successResCount", 1501200024);
        setIntField(term142587, term142587.getClass(), "playerRating", 813083025);
        setIntField(term142587, term142587.getClass(), "highestRating", 1439986578);
        setIntField(term142587, term142587.getClass(), "nameplateId", -1393477237);
        setIntField(term142587, term142587.getClass(), "frameId", 1806901617);
        setIntField(term142587, term142587.getClass(), "characterId", -1060700711);
        setIntField(term142587, term142587.getClass(), "trophyId", 1281979005);
        setIntField(term142587, term142587.getClass(), "playedTutorialBit", -1535572179);
        setIntField(term142587, term142587.getClass(), "firstTutorialCancelNum", -1210680742);
        setIntField(term142587, term142587.getClass(), "masterTutorialCancelNum", -2024761841);
        setIntField(term142587, term142587.getClass(), "totalRepertoireCount", 517435996);
        setIntField(term142587, term142587.getClass(), "totalMapNum", 997085806);
        setLongField(term142587, term142587.getClass(), "totalHiScore", 7440272536369503614L);
        setLongField(term142587, term142587.getClass(), "totalBasicHighScore", -4542644100614481650L);
        setLongField(term142587, term142587.getClass(), "totalAdvancedHighScore", -5670050153563737232L);
        setLongField(term142587, term142587.getClass(), "totalExpertHighScore", 6088450434923228398L);
        setLongField(term142587, term142587.getClass(), "totalMasterHighScore", 7538604659617315855L);
        setIntField(term142699, term142699.getClass(), "year", 2018);
        setShortField(term142699, term142699.getClass(), "month", (short) 4);
        setShortField(term142699, term142699.getClass(), "day", (short) 4);
        setField(term142698, term142698.getClass(), "date", term142699);
        setByteField(term142703, term142703.getClass(), "hour", (byte) 7);
        setByteField(term142703, term142703.getClass(), "minute", (byte) 22);
        setByteField(term142703, term142703.getClass(), "second", (byte) 8);
        setIntField(term142703, term142703.getClass(), "nano", 999186174);
        setField(term142698, term142698.getClass(), "time", term142703);
        setField(term142587, term142587.getClass(), "eventWatchedDate", term142698);
        setIntField(term142587, term142587.getClass(), "friendCount", -1890633633);
        setBooleanField(term142587, term142587.getClass(), "isMaimai", true);
        setField(term142587, term142587.getClass(), "firstGameId", "ChicGOdcQQ");
        setField(term142587, term142587.getClass(), "firstRomVersion", "RDbCrwuOqx");
        setField(term142587, term142587.getClass(), "firstDataVersion", "GpKiABHvoe");
        setIntField(term142747, term142747.getClass(), "year", 2022);
        setShortField(term142747, term142747.getClass(), "month", (short) 1);
        setShortField(term142747, term142747.getClass(), "day", (short) 31);
        setField(term142746, term142746.getClass(), "date", term142747);
        setByteField(term142751, term142751.getClass(), "hour", (byte) 16);
        setByteField(term142751, term142751.getClass(), "minute", (byte) 37);
        setByteField(term142751, term142751.getClass(), "second", (byte) 22);
        setIntField(term142751, term142751.getClass(), "nano", 363647721);
        setField(term142746, term142746.getClass(), "time", term142751);
        setField(term142587, term142587.getClass(), "firstPlayDate", term142746);
        setField(term142587, term142587.getClass(), "lastGameId", "csdvKvMKzx");
        setField(term142587, term142587.getClass(), "lastRomVersion", "xfyCONULzw");
        setField(term142587, term142587.getClass(), "lastDataVersion", "SmpXEpmGyR");
        setIntField(term142793, term142793.getClass(), "year", 2018);
        setShortField(term142793, term142793.getClass(), "month", (short) 11);
        setShortField(term142793, term142793.getClass(), "day", (short) 8);
        setField(term142792, term142792.getClass(), "date", term142793);
        setByteField(term142797, term142797.getClass(), "hour", (byte) 12);
        setByteField(term142797, term142797.getClass(), "minute", (byte) 59);
        setByteField(term142797, term142797.getClass(), "second", (byte) 53);
        setIntField(term142797, term142797.getClass(), "nano", 868414984);
        setField(term142792, term142792.getClass(), "time", term142797);
        setField(term142587, term142587.getClass(), "lastPlayDate", term142792);
        setIntField(term142587, term142587.getClass(), "lastPlaceId", 556792495);
        setField(term142587, term142587.getClass(), "lastPlaceName", "foXieiGQTk");
        setField(term142587, term142587.getClass(), "lastRegionId", "XgtGzhZjwe");
        setField(term142587, term142587.getClass(), "lastRegionName", "kuzULljuRL");
        setField(term142587, term142587.getClass(), "lastAllNetId", "DNgbgDcryI");
        setField(term142587, term142587.getClass(), "lastClientId", "NHOLoiInVI");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTotalExpertHighScore", argTypes, term142587, args);
    }

};


