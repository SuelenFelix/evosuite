package icu.samnyan.aqua.sega.maimai.model.userdata;

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
import static icu.samnyan.aqua.sega.maimai.model.userdata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Long;
import java.lang.Integer;

public class UserItem_setStock_150392516210 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term87250;
     Object term87429;

    public UserItem_setStock_150392516210() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term87256 = new Long(3713624957161771816L);
        term87250 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserItem"));
        Object term87252 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserData"));
        Object term87254 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term87270 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term87271 = newInstance(Class.forName("java.time.LocalDate"));
        Object term87275 = newInstance(Class.forName("java.time.LocalTime"));
        Object term87280 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term87281 = newInstance(Class.forName("java.time.LocalDate"));
        Object term87285 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term87250, term87250.getClass(), "id", -3548672426577893003L);
        setLongField(term87252, term87252.getClass(), "id", 1592020674405941254L);
        setLongField(term87254, term87254.getClass(), "id", 4098407345651793258L);
        setField(term87254, term87254.getClass(), "extId", term87256);
        setField(term87254, term87254.getClass(), "luid", "XhnCbWwpIr");
        setIntField(term87271, term87271.getClass(), "year", 2014);
        setShortField(term87271, term87271.getClass(), "month", (short) 1);
        setShortField(term87271, term87271.getClass(), "day", (short) 23);
        setField(term87270, term87270.getClass(), "date", term87271);
        setByteField(term87275, term87275.getClass(), "hour", (byte) 19);
        setByteField(term87275, term87275.getClass(), "minute", (byte) 10);
        setByteField(term87275, term87275.getClass(), "second", (byte) 5);
        setIntField(term87275, term87275.getClass(), "nano", 522099168);
        setField(term87270, term87270.getClass(), "time", term87275);
        setField(term87254, term87254.getClass(), "registerTime", term87270);
        setIntField(term87281, term87281.getClass(), "year", 2024);
        setShortField(term87281, term87281.getClass(), "month", (short) 11);
        setShortField(term87281, term87281.getClass(), "day", (short) 12);
        setField(term87280, term87280.getClass(), "date", term87281);
        setByteField(term87285, term87285.getClass(), "hour", (byte) 7);
        setByteField(term87285, term87285.getClass(), "minute", (byte) 0);
        setByteField(term87285, term87285.getClass(), "second", (byte) 20);
        setIntField(term87285, term87285.getClass(), "nano", 646827761);
        setField(term87280, term87280.getClass(), "time", term87285);
        setField(term87254, term87254.getClass(), "accessTime", term87280);
        setField(term87252, term87252.getClass(), "card", term87254);
        setIntField(term87252, term87252.getClass(), "lastDataVersion", -848316647);
        setField(term87252, term87252.getClass(), "userName", "BVMUadSiyU");
        setIntField(term87252, term87252.getClass(), "point", -1208380119);
        setIntField(term87252, term87252.getClass(), "totalPoint", -864238024);
        setIntField(term87252, term87252.getClass(), "iconId", -1314380245);
        setIntField(term87252, term87252.getClass(), "nameplateId", 1515851499);
        setIntField(term87252, term87252.getClass(), "frameId", 1012518296);
        setIntField(term87252, term87252.getClass(), "trophyId", 1105035324);
        setIntField(term87252, term87252.getClass(), "playCount", -1584523024);
        setIntField(term87252, term87252.getClass(), "playVsCount", -480708883);
        setIntField(term87252, term87252.getClass(), "playSyncCount", 2138621717);
        setIntField(term87252, term87252.getClass(), "winCount", -215379633);
        setIntField(term87252, term87252.getClass(), "helpCount", -1102891843);
        setIntField(term87252, term87252.getClass(), "comboCount", -1019000095);
        setIntField(term87252, term87252.getClass(), "feverCount", -840293673);
        setIntField(term87252, term87252.getClass(), "totalHiScore", 1264858800);
        setIntField(term87252, term87252.getClass(), "totalEasyHighScore", 1788889024);
        setIntField(term87252, term87252.getClass(), "totalBasicHighScore", -1986327151);
        setIntField(term87252, term87252.getClass(), "totalAdvancedHighScore", 1265876286);
        setIntField(term87252, term87252.getClass(), "totalExpertHighScore", 111275435);
        setIntField(term87252, term87252.getClass(), "totalMasterHighScore", 1944060051);
        setIntField(term87252, term87252.getClass(), "totalReMasterHighScore", 630074094);
        setIntField(term87252, term87252.getClass(), "totalHighSync", 570208042);
        setIntField(term87252, term87252.getClass(), "totalEasySync", -93488030);
        setIntField(term87252, term87252.getClass(), "totalBasicSync", 926138799);
        setIntField(term87252, term87252.getClass(), "totalAdvancedSync", 591313019);
        setIntField(term87252, term87252.getClass(), "totalExpertSync", -1755672438);
        setIntField(term87252, term87252.getClass(), "totalMasterSync", -2140257584);
        setIntField(term87252, term87252.getClass(), "totalReMasterSync", -1626490850);
        setIntField(term87252, term87252.getClass(), "playerRating", 446978027);
        setIntField(term87252, term87252.getClass(), "highestRating", -384315341);
        setIntField(term87252, term87252.getClass(), "rankAuthTailId", 204740619);
        setField(term87252, term87252.getClass(), "eventWatchedDate", "OhWrgFwvJi");
        setField(term87252, term87252.getClass(), "webLimitDate", "DfKWXfTINQ");
        setIntField(term87252, term87252.getClass(), "challengeTrackPhase", 107555188);
        setIntField(term87252, term87252.getClass(), "firstPlayBits", -531718135);
        setField(term87252, term87252.getClass(), "lastPlayDate", "KqusFIxuyo");
        setIntField(term87252, term87252.getClass(), "lastPlaceId", 598160626);
        setField(term87252, term87252.getClass(), "lastPlaceName", "CDpvEYMuDg");
        setIntField(term87252, term87252.getClass(), "lastRegionId", 1754085320);
        setField(term87252, term87252.getClass(), "lastRegionName", "YaZCAiIUPe");
        setField(term87252, term87252.getClass(), "lastClientId", "KsCWHUcJDd");
        setField(term87252, term87252.getClass(), "lastCountryCode", "zkYsnzzwJu");
        setIntField(term87252, term87252.getClass(), "eventPoint", -143315713);
        setIntField(term87252, term87252.getClass(), "totalLv", -362106921);
        setIntField(term87252, term87252.getClass(), "lastLoginBonusDay", 86367204);
        setIntField(term87252, term87252.getClass(), "lastSurvivalBonusDay", -602995676);
        setIntField(term87252, term87252.getClass(), "loginBonusLv", 815088701);
        setField(term87250, term87250.getClass(), "user", term87252);
        setIntField(term87250, term87250.getClass(), "itemKind", 502026234);
        setIntField(term87250, term87250.getClass(), "itemId", -871479292);
        setIntField(term87250, term87250.getClass(), "stock", -1077764191);
        term87429 = new Integer(1374586510);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai.model.userdata.UserItem");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term87429;
        callMethod(klass, "setStock", argTypes, term87250, args);
    }

};


