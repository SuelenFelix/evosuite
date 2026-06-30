package icu.samnyan.aqua.sega.chunithm.service;

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
import static icu.samnyan.aqua.sega.chunithm.service.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Long;

public class UserActivityService_save_14710561900 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5620;

    public UserActivityService_save_14710561900() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term5626 = new Long(-6573104506744284592L);
        term5620 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserActivity"));
        Object term5622 = newInstance(Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserData"));
        Object term5624 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term5640 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term5641 = newInstance(Class.forName("java.time.LocalDate"));
        Object term5645 = newInstance(Class.forName("java.time.LocalTime"));
        Object term5650 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term5651 = newInstance(Class.forName("java.time.LocalDate"));
        Object term5655 = newInstance(Class.forName("java.time.LocalTime"));
        Object term5672 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term5673 = newInstance(Class.forName("java.time.LocalDate"));
        Object term5677 = newInstance(Class.forName("java.time.LocalTime"));
        Object term5733 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term5734 = newInstance(Class.forName("java.time.LocalDate"));
        Object term5738 = newInstance(Class.forName("java.time.LocalTime"));
        Object term5781 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term5782 = newInstance(Class.forName("java.time.LocalDate"));
        Object term5786 = newInstance(Class.forName("java.time.LocalTime"));
        Object term5827 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term5828 = newInstance(Class.forName("java.time.LocalDate"));
        Object term5832 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term5620, term5620.getClass(), "id", -7291742736502427077L);
        setLongField(term5622, term5622.getClass(), "id", -8121849829073967555L);
        setLongField(term5624, term5624.getClass(), "id", 5219030281405653303L);
        setField(term5624, term5624.getClass(), "extId", term5626);
        setField(term5624, term5624.getClass(), "luid", "WVbxuoDBcn");
        setIntField(term5641, term5641.getClass(), "year", 2021);
        setShortField(term5641, term5641.getClass(), "month", (short) 12);
        setShortField(term5641, term5641.getClass(), "day", (short) 1);
        setField(term5640, term5640.getClass(), "date", term5641);
        setByteField(term5645, term5645.getClass(), "hour", (byte) 15);
        setByteField(term5645, term5645.getClass(), "minute", (byte) 30);
        setByteField(term5645, term5645.getClass(), "second", (byte) 5);
        setIntField(term5645, term5645.getClass(), "nano", 996341606);
        setField(term5640, term5640.getClass(), "time", term5645);
        setField(term5624, term5624.getClass(), "registerTime", term5640);
        setIntField(term5651, term5651.getClass(), "year", 2016);
        setShortField(term5651, term5651.getClass(), "month", (short) 4);
        setShortField(term5651, term5651.getClass(), "day", (short) 18);
        setField(term5650, term5650.getClass(), "date", term5651);
        setByteField(term5655, term5655.getClass(), "hour", (byte) 15);
        setByteField(term5655, term5655.getClass(), "minute", (byte) 56);
        setByteField(term5655, term5655.getClass(), "second", (byte) 45);
        setIntField(term5655, term5655.getClass(), "nano", 248103350);
        setField(term5650, term5650.getClass(), "time", term5655);
        setField(term5624, term5624.getClass(), "accessTime", term5650);
        setField(term5622, term5622.getClass(), "card", term5624);
        setField(term5622, term5622.getClass(), "userName", "pvDEABOxLt");
        setIntField(term5673, term5673.getClass(), "year", 2028);
        setShortField(term5673, term5673.getClass(), "month", (short) 3);
        setShortField(term5673, term5673.getClass(), "day", (short) 25);
        setField(term5672, term5672.getClass(), "date", term5673);
        setByteField(term5677, term5677.getClass(), "hour", (byte) 6);
        setByteField(term5677, term5677.getClass(), "minute", (byte) 9);
        setByteField(term5677, term5677.getClass(), "second", (byte) 35);
        setIntField(term5677, term5677.getClass(), "nano", 744453524);
        setField(term5672, term5672.getClass(), "time", term5677);
        setField(term5622, term5622.getClass(), "lastLoginDate", term5672);
        setBooleanField(term5622, term5622.getClass(), "isWebJoin", true);
        setField(term5622, term5622.getClass(), "webLimitDate", "beAMpkroCQ");
        setIntField(term5622, term5622.getClass(), "level", -1941343035);
        setIntField(term5622, term5622.getClass(), "reincarnationNum", 947897214);
        setField(term5622, term5622.getClass(), "exp", "uSUvKAyuvd");
        setLongField(term5622, term5622.getClass(), "point", -8471550651709805183L);
        setLongField(term5622, term5622.getClass(), "totalPoint", -948292411727204525L);
        setIntField(term5622, term5622.getClass(), "playCount", 1496340209);
        setIntField(term5622, term5622.getClass(), "multiPlayCount", -1748391876);
        setIntField(term5622, term5622.getClass(), "multiWinCount", 43258317);
        setIntField(term5622, term5622.getClass(), "requestResCount", 1707220033);
        setIntField(term5622, term5622.getClass(), "acceptResCount", -1792504217);
        setIntField(term5622, term5622.getClass(), "successResCount", 1824538861);
        setIntField(term5622, term5622.getClass(), "playerRating", 499519708);
        setIntField(term5622, term5622.getClass(), "highestRating", 1501165033);
        setIntField(term5622, term5622.getClass(), "nameplateId", 510162332);
        setIntField(term5622, term5622.getClass(), "frameId", 888506903);
        setIntField(term5622, term5622.getClass(), "characterId", 200252898);
        setIntField(term5622, term5622.getClass(), "trophyId", -1831826725);
        setIntField(term5622, term5622.getClass(), "playedTutorialBit", 752152965);
        setIntField(term5622, term5622.getClass(), "firstTutorialCancelNum", -1577069773);
        setIntField(term5622, term5622.getClass(), "masterTutorialCancelNum", -266625190);
        setIntField(term5622, term5622.getClass(), "totalRepertoireCount", 489201218);
        setIntField(term5622, term5622.getClass(), "totalMapNum", 464181937);
        setLongField(term5622, term5622.getClass(), "totalHiScore", -8892586408602479513L);
        setLongField(term5622, term5622.getClass(), "totalBasicHighScore", 4616440478358528406L);
        setLongField(term5622, term5622.getClass(), "totalAdvancedHighScore", 3427570961451840069L);
        setLongField(term5622, term5622.getClass(), "totalExpertHighScore", 4502292577098212311L);
        setLongField(term5622, term5622.getClass(), "totalMasterHighScore", -3730936709704460408L);
        setIntField(term5734, term5734.getClass(), "year", 2017);
        setShortField(term5734, term5734.getClass(), "month", (short) 6);
        setShortField(term5734, term5734.getClass(), "day", (short) 28);
        setField(term5733, term5733.getClass(), "date", term5734);
        setByteField(term5738, term5738.getClass(), "hour", (byte) 8);
        setByteField(term5738, term5738.getClass(), "minute", (byte) 1);
        setByteField(term5738, term5738.getClass(), "second", (byte) 14);
        setIntField(term5738, term5738.getClass(), "nano", 501033715);
        setField(term5733, term5733.getClass(), "time", term5738);
        setField(term5622, term5622.getClass(), "eventWatchedDate", term5733);
        setIntField(term5622, term5622.getClass(), "friendCount", -1455526612);
        setBooleanField(term5622, term5622.getClass(), "isMaimai", true);
        setField(term5622, term5622.getClass(), "firstGameId", "onQLVONGuf");
        setField(term5622, term5622.getClass(), "firstRomVersion", "SOrEHbcbmn");
        setField(term5622, term5622.getClass(), "firstDataVersion", "bnsyeQXFdu");
        setIntField(term5782, term5782.getClass(), "year", 2016);
        setShortField(term5782, term5782.getClass(), "month", (short) 10);
        setShortField(term5782, term5782.getClass(), "day", (short) 10);
        setField(term5781, term5781.getClass(), "date", term5782);
        setByteField(term5786, term5786.getClass(), "hour", (byte) 16);
        setByteField(term5786, term5786.getClass(), "minute", (byte) 7);
        setByteField(term5786, term5786.getClass(), "second", (byte) 16);
        setIntField(term5786, term5786.getClass(), "nano", 995200309);
        setField(term5781, term5781.getClass(), "time", term5786);
        setField(term5622, term5622.getClass(), "firstPlayDate", term5781);
        setField(term5622, term5622.getClass(), "lastGameId", "BwtdjiefJn");
        setField(term5622, term5622.getClass(), "lastRomVersion", "jDmhBrIoDa");
        setField(term5622, term5622.getClass(), "lastDataVersion", "SPtPatHeOm");
        setIntField(term5828, term5828.getClass(), "year", 2014);
        setShortField(term5828, term5828.getClass(), "month", (short) 5);
        setShortField(term5828, term5828.getClass(), "day", (short) 31);
        setField(term5827, term5827.getClass(), "date", term5828);
        setByteField(term5832, term5832.getClass(), "hour", (byte) 16);
        setByteField(term5832, term5832.getClass(), "minute", (byte) 3);
        setByteField(term5832, term5832.getClass(), "second", (byte) 14);
        setIntField(term5832, term5832.getClass(), "nano", 281059649);
        setField(term5827, term5827.getClass(), "time", term5832);
        setField(term5622, term5622.getClass(), "lastPlayDate", term5827);
        setIntField(term5622, term5622.getClass(), "lastPlaceId", -941356098);
        setField(term5622, term5622.getClass(), "lastPlaceName", "ywmcuThdfL");
        setField(term5622, term5622.getClass(), "lastRegionId", "GBOEuByOfr");
        setField(term5622, term5622.getClass(), "lastRegionName", "NHbOFFjyVK");
        setField(term5622, term5622.getClass(), "lastAllNetId", "zaloBqlrSo");
        setField(term5622, term5622.getClass(), "lastClientId", "vvoLrMGCoN");
        setField(term5620, term5620.getClass(), "user", term5622);
        setIntField(term5620, term5620.getClass(), "kind", -201517446);
        setIntField(term5620, term5620.getClass(), "activityId", -97742366);
        setIntField(term5620, term5620.getClass(), "sortNumber", 1638851942);
        setIntField(term5620, term5620.getClass(), "param1", 1374790203);
        setIntField(term5620, term5620.getClass(), "param2", 1160010161);
        setIntField(term5620, term5620.getClass(), "param3", -423900705);
        setIntField(term5620, term5620.getClass(), "param4", -525570815);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chunithm.service.UserActivityService");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("icu.samnyan.aqua.sega.chunithm.model.userdata.UserActivity");
        Object[] args = new Object[1];
        args[0] = term5620;
        callMethod(klass, "save", argTypes, null, args);
    }

};


