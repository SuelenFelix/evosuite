package icu.samnyan.aqua.sega.maimai2.model.userdata;

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
import static icu.samnyan.aqua.sega.maimai2.model.userdata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Long;
import java.util.ArrayList;
import java.lang.Integer;

public class UserDetail_getLastRomVersion_117600688124 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term209158;

    public UserDetail_getLastRomVersion_117600688124() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term209162 = new Long(-1571034605670661708L);
        Integer term209225 = new Integer(-1648760670);
        Integer term209227 = new Integer(590703291);
        ArrayList term209223 = new ArrayList();
        ((ArrayList) term209223).add(term209225);
        ((ArrayList) term209223).add(term209227);
        Integer term209233 = new Integer(-2033199492);
        Integer term209235 = new Integer(350096397);
        Integer term209237 = new Integer(-325295536);
        Integer term209239 = new Integer(-411068820);
        Integer term209241 = new Integer(-608484309);
        Integer term209243 = new Integer(-396456847);
        Integer term209245 = new Integer(1826615515);
        Integer term209247 = new Integer(1129458600);
        ArrayList term209231 = new ArrayList();
        ((ArrayList) term209231).add(term209233);
        ((ArrayList) term209231).add(term209235);
        ((ArrayList) term209231).add(term209237);
        ((ArrayList) term209231).add(term209239);
        ((ArrayList) term209231).add(term209241);
        ((ArrayList) term209231).add(term209243);
        ((ArrayList) term209231).add(term209245);
        ((ArrayList) term209231).add(term209247);
        term209158 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term209160 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term209176 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term209177 = newInstance(Class.forName("java.time.LocalDate"));
        Object term209181 = newInstance(Class.forName("java.time.LocalTime"));
        Object term209186 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term209187 = newInstance(Class.forName("java.time.LocalDate"));
        Object term209191 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term209158, term209158.getClass(), "id", -5011107037416422675L);
        setLongField(term209160, term209160.getClass(), "id", -8958846949993717340L);
        setField(term209160, term209160.getClass(), "extId", term209162);
        setField(term209160, term209160.getClass(), "luid", "nSQlbmzzLW");
        setIntField(term209177, term209177.getClass(), "year", 2015);
        setShortField(term209177, term209177.getClass(), "month", (short) 3);
        setShortField(term209177, term209177.getClass(), "day", (short) 31);
        setField(term209176, term209176.getClass(), "date", term209177);
        setByteField(term209181, term209181.getClass(), "hour", (byte) 9);
        setByteField(term209181, term209181.getClass(), "minute", (byte) 42);
        setByteField(term209181, term209181.getClass(), "second", (byte) 3);
        setIntField(term209181, term209181.getClass(), "nano", 508678403);
        setField(term209176, term209176.getClass(), "time", term209181);
        setField(term209160, term209160.getClass(), "registerTime", term209176);
        setIntField(term209187, term209187.getClass(), "year", 2020);
        setShortField(term209187, term209187.getClass(), "month", (short) 9);
        setShortField(term209187, term209187.getClass(), "day", (short) 13);
        setField(term209186, term209186.getClass(), "date", term209187);
        setByteField(term209191, term209191.getClass(), "hour", (byte) 0);
        setByteField(term209191, term209191.getClass(), "minute", (byte) 7);
        setByteField(term209191, term209191.getClass(), "second", (byte) 27);
        setIntField(term209191, term209191.getClass(), "nano", 835567947);
        setField(term209186, term209186.getClass(), "time", term209191);
        setField(term209160, term209160.getClass(), "accessTime", term209186);
        setField(term209158, term209158.getClass(), "card", term209160);
        setField(term209158, term209158.getClass(), "userName", "NzCUIjYlSt");
        setIntField(term209158, term209158.getClass(), "isNetMember", 2053260189);
        setIntField(term209158, term209158.getClass(), "iconId", -2053852874);
        setIntField(term209158, term209158.getClass(), "plateId", -495359675);
        setIntField(term209158, term209158.getClass(), "titleId", -384263579);
        setIntField(term209158, term209158.getClass(), "partnerId", 846361208);
        setIntField(term209158, term209158.getClass(), "frameId", 1800799519);
        setIntField(term209158, term209158.getClass(), "selectMapId", 100734387);
        setIntField(term209158, term209158.getClass(), "totalAwake", 654779093);
        setIntField(term209158, term209158.getClass(), "gradeRating", -2111377072);
        setIntField(term209158, term209158.getClass(), "musicRating", -983510285);
        setIntField(term209158, term209158.getClass(), "playerRating", 515505845);
        setIntField(term209158, term209158.getClass(), "highestRating", 2062061908);
        setIntField(term209158, term209158.getClass(), "gradeRank", 52784804);
        setIntField(term209158, term209158.getClass(), "classRank", -1368391368);
        setIntField(term209158, term209158.getClass(), "courseRank", 1369129310);
        setField(term209158, term209158.getClass(), "charaSlot", term209223);
        setField(term209158, term209158.getClass(), "charaLockSlot", term209231);
        setLongField(term209158, term209158.getClass(), "contentBit", 8754835613868455656L);
        setIntField(term209158, term209158.getClass(), "playCount", -780519895);
        setField(term209158, term209158.getClass(), "eventWatchedDate", "lFUtoXWQuy");
        setField(term209158, term209158.getClass(), "lastGameId", "cqUSTqSiGn");
        setField(term209158, term209158.getClass(), "lastRomVersion", "uMUfxkPQVb");
        setField(term209158, term209158.getClass(), "lastDataVersion", "antCkERyql");
        setField(term209158, term209158.getClass(), "lastLoginDate", "RLzWpKyOcm");
        setField(term209158, term209158.getClass(), "lastPlayDate", "AiDeJiJcDC");
        setIntField(term209158, term209158.getClass(), "lastPlayCredit", 137957762);
        setIntField(term209158, term209158.getClass(), "lastPlayMode", -1051997267);
        setIntField(term209158, term209158.getClass(), "lastPlaceId", -62396728);
        setField(term209158, term209158.getClass(), "lastPlaceName", "ACFOBqKUKd");
        setIntField(term209158, term209158.getClass(), "lastAllNetId", -268599867);
        setIntField(term209158, term209158.getClass(), "lastRegionId", -1052701176);
        setField(term209158, term209158.getClass(), "lastRegionName", "BIrUkKfKmF");
        setField(term209158, term209158.getClass(), "lastClientId", "kKWwlRUdxO");
        setField(term209158, term209158.getClass(), "lastCountryCode", "mPmWMlHjdS");
        setIntField(term209158, term209158.getClass(), "lastSelectEMoney", 545101691);
        setIntField(term209158, term209158.getClass(), "lastSelectTicket", 1161229876);
        setIntField(term209158, term209158.getClass(), "lastSelectCourse", -960232938);
        setIntField(term209158, term209158.getClass(), "lastCountCourse", 164986407);
        setField(term209158, term209158.getClass(), "firstGameId", "vVMAKTsnWp");
        setField(term209158, term209158.getClass(), "firstRomVersion", "gHkufiBxQY");
        setField(term209158, term209158.getClass(), "firstDataVersion", "FpnOTthGSf");
        setField(term209158, term209158.getClass(), "firstPlayDate", "ZlDJfKbWuT");
        setField(term209158, term209158.getClass(), "compatibleCmVersion", "KPKvkukffl");
        setField(term209158, term209158.getClass(), "dailyBonusDate", "DztkzYmExj");
        setField(term209158, term209158.getClass(), "dailyCourseBonusDate", "jgLlnOSDbQ");
        setField(term209158, term209158.getClass(), "lastPairLoginDate", "KJGZNumCAL");
        setField(term209158, term209158.getClass(), "lastTrialPlayDate", "iBvRhpQbES");
        setIntField(term209158, term209158.getClass(), "playVsCount", 1508923050);
        setIntField(term209158, term209158.getClass(), "playSyncCount", 1732773238);
        setIntField(term209158, term209158.getClass(), "winCount", -312812260);
        setIntField(term209158, term209158.getClass(), "helpCount", -1403354454);
        setIntField(term209158, term209158.getClass(), "comboCount", 225390294);
        setLongField(term209158, term209158.getClass(), "totalDeluxscore", -5172868456632523478L);
        setLongField(term209158, term209158.getClass(), "totalBasicDeluxscore", -4738020182896727772L);
        setLongField(term209158, term209158.getClass(), "totalAdvancedDeluxscore", -3991476732027265263L);
        setLongField(term209158, term209158.getClass(), "totalExpertDeluxscore", -8337971790150085955L);
        setLongField(term209158, term209158.getClass(), "totalMasterDeluxscore", 8803656305740741780L);
        setLongField(term209158, term209158.getClass(), "totalReMasterDeluxscore", 6508795630556315171L);
        setIntField(term209158, term209158.getClass(), "totalSync", 627436431);
        setIntField(term209158, term209158.getClass(), "totalBasicSync", -226488133);
        setIntField(term209158, term209158.getClass(), "totalAdvancedSync", 2016800886);
        setIntField(term209158, term209158.getClass(), "totalExpertSync", 1306220321);
        setIntField(term209158, term209158.getClass(), "totalMasterSync", -925927013);
        setIntField(term209158, term209158.getClass(), "totalReMasterSync", 560338899);
        setLongField(term209158, term209158.getClass(), "totalAchievement", -2254422363064059234L);
        setLongField(term209158, term209158.getClass(), "totalBasicAchievement", -6360645794639848346L);
        setLongField(term209158, term209158.getClass(), "totalAdvancedAchievement", -409755716386126160L);
        setLongField(term209158, term209158.getClass(), "totalExpertAchievement", -2762250715796493645L);
        setLongField(term209158, term209158.getClass(), "totalMasterAchievement", 9187657468194834951L);
        setLongField(term209158, term209158.getClass(), "totalReMasterAchievement", 1002083751724182558L);
        setLongField(term209158, term209158.getClass(), "playerOldRating", -9203915944121138435L);
        setLongField(term209158, term209158.getClass(), "playerNewRating", 7415866669809957793L);
        setIntField(term209158, term209158.getClass(), "banState", 173805075);
        setLongField(term209158, term209158.getClass(), "dateTime", -6971932757611425617L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLastRomVersion", argTypes, term209158, args);
    }

};


