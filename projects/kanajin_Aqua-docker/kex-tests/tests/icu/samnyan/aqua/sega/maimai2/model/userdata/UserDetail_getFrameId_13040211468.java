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

public class UserDetail_getFrameId_13040211468 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term200108;

    public UserDetail_getFrameId_13040211468() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term200112 = new Long(-5207216109884759743L);
        Integer term200175 = new Integer(-1727494705);
        Integer term200177 = new Integer(-1168439000);
        Integer term200179 = new Integer(-1552818345);
        Integer term200181 = new Integer(-811708149);
        Integer term200183 = new Integer(2060766727);
        Integer term200185 = new Integer(1298229635);
        Integer term200187 = new Integer(-569196422);
        ArrayList term200173 = new ArrayList();
        ((ArrayList) term200173).add(term200175);
        ((ArrayList) term200173).add(term200177);
        ((ArrayList) term200173).add(term200179);
        ((ArrayList) term200173).add(term200181);
        ((ArrayList) term200173).add(term200183);
        ((ArrayList) term200173).add(term200185);
        ((ArrayList) term200173).add(term200187);
        Integer term200193 = new Integer(-394638810);
        Integer term200195 = new Integer(790706322);
        Integer term200197 = new Integer(699712077);
        ArrayList term200191 = new ArrayList();
        ((ArrayList) term200191).add(term200193);
        ((ArrayList) term200191).add(term200195);
        ((ArrayList) term200191).add(term200197);
        term200108 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term200110 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term200126 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term200127 = newInstance(Class.forName("java.time.LocalDate"));
        Object term200131 = newInstance(Class.forName("java.time.LocalTime"));
        Object term200136 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term200137 = newInstance(Class.forName("java.time.LocalDate"));
        Object term200141 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term200108, term200108.getClass(), "id", 4918693338600446333L);
        setLongField(term200110, term200110.getClass(), "id", 1379952003868337325L);
        setField(term200110, term200110.getClass(), "extId", term200112);
        setField(term200110, term200110.getClass(), "luid", "tuuGLQHGpJ");
        setIntField(term200127, term200127.getClass(), "year", 2015);
        setShortField(term200127, term200127.getClass(), "month", (short) 5);
        setShortField(term200127, term200127.getClass(), "day", (short) 30);
        setField(term200126, term200126.getClass(), "date", term200127);
        setByteField(term200131, term200131.getClass(), "hour", (byte) 6);
        setByteField(term200131, term200131.getClass(), "minute", (byte) 20);
        setByteField(term200131, term200131.getClass(), "second", (byte) 29);
        setIntField(term200131, term200131.getClass(), "nano", 871322714);
        setField(term200126, term200126.getClass(), "time", term200131);
        setField(term200110, term200110.getClass(), "registerTime", term200126);
        setIntField(term200137, term200137.getClass(), "year", 2029);
        setShortField(term200137, term200137.getClass(), "month", (short) 9);
        setShortField(term200137, term200137.getClass(), "day", (short) 21);
        setField(term200136, term200136.getClass(), "date", term200137);
        setByteField(term200141, term200141.getClass(), "hour", (byte) 3);
        setByteField(term200141, term200141.getClass(), "minute", (byte) 36);
        setByteField(term200141, term200141.getClass(), "second", (byte) 11);
        setIntField(term200141, term200141.getClass(), "nano", 295278203);
        setField(term200136, term200136.getClass(), "time", term200141);
        setField(term200110, term200110.getClass(), "accessTime", term200136);
        setField(term200108, term200108.getClass(), "card", term200110);
        setField(term200108, term200108.getClass(), "userName", "rFjmvrGmka");
        setIntField(term200108, term200108.getClass(), "isNetMember", -2030508372);
        setIntField(term200108, term200108.getClass(), "iconId", 1541228086);
        setIntField(term200108, term200108.getClass(), "plateId", 297742417);
        setIntField(term200108, term200108.getClass(), "titleId", 1816437264);
        setIntField(term200108, term200108.getClass(), "partnerId", -1501877126);
        setIntField(term200108, term200108.getClass(), "frameId", 803853178);
        setIntField(term200108, term200108.getClass(), "selectMapId", -1572151301);
        setIntField(term200108, term200108.getClass(), "totalAwake", 1802492559);
        setIntField(term200108, term200108.getClass(), "gradeRating", -800228870);
        setIntField(term200108, term200108.getClass(), "musicRating", -604044709);
        setIntField(term200108, term200108.getClass(), "playerRating", -474659885);
        setIntField(term200108, term200108.getClass(), "highestRating", 992754091);
        setIntField(term200108, term200108.getClass(), "gradeRank", -711076640);
        setIntField(term200108, term200108.getClass(), "classRank", 994094102);
        setIntField(term200108, term200108.getClass(), "courseRank", -1536607529);
        setField(term200108, term200108.getClass(), "charaSlot", term200173);
        setField(term200108, term200108.getClass(), "charaLockSlot", term200191);
        setLongField(term200108, term200108.getClass(), "contentBit", -7308035967659707286L);
        setIntField(term200108, term200108.getClass(), "playCount", 2103296701);
        setField(term200108, term200108.getClass(), "eventWatchedDate", "RijAbGfWJJ");
        setField(term200108, term200108.getClass(), "lastGameId", "BFhXRjyNcR");
        setField(term200108, term200108.getClass(), "lastRomVersion", "CbegedoDMX");
        setField(term200108, term200108.getClass(), "lastDataVersion", "QaUSMtBYEg");
        setField(term200108, term200108.getClass(), "lastLoginDate", "mhHbJIyDIB");
        setField(term200108, term200108.getClass(), "lastPlayDate", "ZItlvaBFFD");
        setIntField(term200108, term200108.getClass(), "lastPlayCredit", 56957852);
        setIntField(term200108, term200108.getClass(), "lastPlayMode", 1777669010);
        setIntField(term200108, term200108.getClass(), "lastPlaceId", 152298427);
        setField(term200108, term200108.getClass(), "lastPlaceName", "oRinHImOGE");
        setIntField(term200108, term200108.getClass(), "lastAllNetId", 450778931);
        setIntField(term200108, term200108.getClass(), "lastRegionId", -1482855200);
        setField(term200108, term200108.getClass(), "lastRegionName", "JfZLvvSNPi");
        setField(term200108, term200108.getClass(), "lastClientId", "iCNRyVJwAS");
        setField(term200108, term200108.getClass(), "lastCountryCode", "unLxzAzMJt");
        setIntField(term200108, term200108.getClass(), "lastSelectEMoney", 1147113614);
        setIntField(term200108, term200108.getClass(), "lastSelectTicket", -243254772);
        setIntField(term200108, term200108.getClass(), "lastSelectCourse", -1721895188);
        setIntField(term200108, term200108.getClass(), "lastCountCourse", 1090061150);
        setField(term200108, term200108.getClass(), "firstGameId", "fzehOESRgZ");
        setField(term200108, term200108.getClass(), "firstRomVersion", "RzCXJXEAma");
        setField(term200108, term200108.getClass(), "firstDataVersion", "UFrENuvfdm");
        setField(term200108, term200108.getClass(), "firstPlayDate", "yGjsfchYjV");
        setField(term200108, term200108.getClass(), "compatibleCmVersion", "TpoPuPsvkY");
        setField(term200108, term200108.getClass(), "dailyBonusDate", "kIrwxJpdua");
        setField(term200108, term200108.getClass(), "dailyCourseBonusDate", "QqQLTYzlmk");
        setField(term200108, term200108.getClass(), "lastPairLoginDate", "bvmIIrpUWn");
        setField(term200108, term200108.getClass(), "lastTrialPlayDate", "dREpDsQOQK");
        setIntField(term200108, term200108.getClass(), "playVsCount", -1849804262);
        setIntField(term200108, term200108.getClass(), "playSyncCount", -391323239);
        setIntField(term200108, term200108.getClass(), "winCount", 563491270);
        setIntField(term200108, term200108.getClass(), "helpCount", 1732544982);
        setIntField(term200108, term200108.getClass(), "comboCount", 961758280);
        setLongField(term200108, term200108.getClass(), "totalDeluxscore", -3079188602701979724L);
        setLongField(term200108, term200108.getClass(), "totalBasicDeluxscore", 4594249833913677901L);
        setLongField(term200108, term200108.getClass(), "totalAdvancedDeluxscore", -8011749040065963433L);
        setLongField(term200108, term200108.getClass(), "totalExpertDeluxscore", 6646239697396383164L);
        setLongField(term200108, term200108.getClass(), "totalMasterDeluxscore", -6302123431012645974L);
        setLongField(term200108, term200108.getClass(), "totalReMasterDeluxscore", -6774894129275295131L);
        setIntField(term200108, term200108.getClass(), "totalSync", -1645689842);
        setIntField(term200108, term200108.getClass(), "totalBasicSync", 1363844724);
        setIntField(term200108, term200108.getClass(), "totalAdvancedSync", 63712079);
        setIntField(term200108, term200108.getClass(), "totalExpertSync", 146408738);
        setIntField(term200108, term200108.getClass(), "totalMasterSync", -496409376);
        setIntField(term200108, term200108.getClass(), "totalReMasterSync", 1373203092);
        setLongField(term200108, term200108.getClass(), "totalAchievement", 538680737345231926L);
        setLongField(term200108, term200108.getClass(), "totalBasicAchievement", -3323235787265392046L);
        setLongField(term200108, term200108.getClass(), "totalAdvancedAchievement", 5706605646908256985L);
        setLongField(term200108, term200108.getClass(), "totalExpertAchievement", -6862551204960712340L);
        setLongField(term200108, term200108.getClass(), "totalMasterAchievement", -2611768320733508630L);
        setLongField(term200108, term200108.getClass(), "totalReMasterAchievement", 3956396540423829829L);
        setLongField(term200108, term200108.getClass(), "playerOldRating", 4225737646256871072L);
        setLongField(term200108, term200108.getClass(), "playerNewRating", -4793231192343195887L);
        setIntField(term200108, term200108.getClass(), "banState", -120921180);
        setLongField(term200108, term200108.getClass(), "dateTime", -1469167471004592973L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getFrameId", argTypes, term200108, args);
    }

};


