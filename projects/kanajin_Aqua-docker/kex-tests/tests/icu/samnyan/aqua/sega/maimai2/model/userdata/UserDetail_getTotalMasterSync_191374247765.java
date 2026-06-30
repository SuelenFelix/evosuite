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

public class UserDetail_getTotalMasterSync_191374247765 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4266339;

    public UserDetail_getTotalMasterSync_191374247765() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4266343 = new Long(1924669448645583780L);
        Integer term4266406 = new Integer(1176018048);
        Integer term4266408 = new Integer(1196729512);
        Integer term4266410 = new Integer(-1129446141);
        Integer term4266412 = new Integer(-2055516348);
        Integer term4266414 = new Integer(-1810305325);
        Integer term4266416 = new Integer(891522595);
        Integer term4266418 = new Integer(584482188);
        Integer term4266420 = new Integer(-966923623);
        Integer term4266422 = new Integer(-1827280492);
        ArrayList term4266404 = new ArrayList();
        ((ArrayList) term4266404).add(term4266406);
        ((ArrayList) term4266404).add(term4266408);
        ((ArrayList) term4266404).add(term4266410);
        ((ArrayList) term4266404).add(term4266412);
        ((ArrayList) term4266404).add(term4266414);
        ((ArrayList) term4266404).add(term4266416);
        ((ArrayList) term4266404).add(term4266418);
        ((ArrayList) term4266404).add(term4266420);
        ((ArrayList) term4266404).add(term4266422);
        Integer term4266428 = new Integer(-540366977);
        Integer term4266430 = new Integer(-87673396);
        Integer term4266432 = new Integer(854845151);
        Integer term4266434 = new Integer(-427113243);
        Integer term4266436 = new Integer(1884007720);
        Integer term4266438 = new Integer(444461504);
        Integer term4266440 = new Integer(-723040972);
        ArrayList term4266426 = new ArrayList();
        ((ArrayList) term4266426).add(term4266428);
        ((ArrayList) term4266426).add(term4266430);
        ((ArrayList) term4266426).add(term4266432);
        ((ArrayList) term4266426).add(term4266434);
        ((ArrayList) term4266426).add(term4266436);
        ((ArrayList) term4266426).add(term4266438);
        ((ArrayList) term4266426).add(term4266440);
        term4266339 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term4266341 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term4266357 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4266358 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4266362 = newInstance(Class.forName("java.time.LocalTime"));
        Object term4266367 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4266368 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4266372 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term4266339, term4266339.getClass(), "id", -7671512120445312250L);
        setLongField(term4266341, term4266341.getClass(), "id", -1771080328485189471L);
        setField(term4266341, term4266341.getClass(), "extId", term4266343);
        setField(term4266341, term4266341.getClass(), "luid", "TXGzwKOtPq");
        setIntField(term4266358, term4266358.getClass(), "year", 2028);
        setShortField(term4266358, term4266358.getClass(), "month", (short) 10);
        setShortField(term4266358, term4266358.getClass(), "day", (short) 8);
        setField(term4266357, term4266357.getClass(), "date", term4266358);
        setByteField(term4266362, term4266362.getClass(), "hour", (byte) 17);
        setByteField(term4266362, term4266362.getClass(), "minute", (byte) 39);
        setByteField(term4266362, term4266362.getClass(), "second", (byte) 59);
        setIntField(term4266362, term4266362.getClass(), "nano", 835271137);
        setField(term4266357, term4266357.getClass(), "time", term4266362);
        setField(term4266341, term4266341.getClass(), "registerTime", term4266357);
        setIntField(term4266368, term4266368.getClass(), "year", 2027);
        setShortField(term4266368, term4266368.getClass(), "month", (short) 1);
        setShortField(term4266368, term4266368.getClass(), "day", (short) 14);
        setField(term4266367, term4266367.getClass(), "date", term4266368);
        setByteField(term4266372, term4266372.getClass(), "hour", (byte) 5);
        setByteField(term4266372, term4266372.getClass(), "minute", (byte) 59);
        setByteField(term4266372, term4266372.getClass(), "second", (byte) 8);
        setIntField(term4266372, term4266372.getClass(), "nano", 576588294);
        setField(term4266367, term4266367.getClass(), "time", term4266372);
        setField(term4266341, term4266341.getClass(), "accessTime", term4266367);
        setField(term4266339, term4266339.getClass(), "card", term4266341);
        setField(term4266339, term4266339.getClass(), "userName", "YVeMdYMjEx");
        setIntField(term4266339, term4266339.getClass(), "isNetMember", -932851380);
        setIntField(term4266339, term4266339.getClass(), "iconId", -1003145601);
        setIntField(term4266339, term4266339.getClass(), "plateId", -1302156726);
        setIntField(term4266339, term4266339.getClass(), "titleId", 1026676887);
        setIntField(term4266339, term4266339.getClass(), "partnerId", -418620331);
        setIntField(term4266339, term4266339.getClass(), "frameId", -1882637900);
        setIntField(term4266339, term4266339.getClass(), "selectMapId", -1160861906);
        setIntField(term4266339, term4266339.getClass(), "totalAwake", -1599200291);
        setIntField(term4266339, term4266339.getClass(), "gradeRating", -1861064391);
        setIntField(term4266339, term4266339.getClass(), "musicRating", -1521903079);
        setIntField(term4266339, term4266339.getClass(), "playerRating", -1433144544);
        setIntField(term4266339, term4266339.getClass(), "highestRating", -556425925);
        setIntField(term4266339, term4266339.getClass(), "gradeRank", -2124698990);
        setIntField(term4266339, term4266339.getClass(), "classRank", -1956401663);
        setIntField(term4266339, term4266339.getClass(), "courseRank", -1572847132);
        setField(term4266339, term4266339.getClass(), "charaSlot", term4266404);
        setField(term4266339, term4266339.getClass(), "charaLockSlot", term4266426);
        setLongField(term4266339, term4266339.getClass(), "contentBit", -3965951776126662266L);
        setIntField(term4266339, term4266339.getClass(), "playCount", -1084656971);
        setField(term4266339, term4266339.getClass(), "eventWatchedDate", "iTZLGNjZtN");
        setField(term4266339, term4266339.getClass(), "lastGameId", "CtdiRBYAEG");
        setField(term4266339, term4266339.getClass(), "lastRomVersion", "gghEclGsGW");
        setField(term4266339, term4266339.getClass(), "lastDataVersion", "QxrWbwdviX");
        setField(term4266339, term4266339.getClass(), "lastLoginDate", "gEtxoiOszR");
        setField(term4266339, term4266339.getClass(), "lastPlayDate", "eBmwNlDaQu");
        setIntField(term4266339, term4266339.getClass(), "lastPlayCredit", 1032319911);
        setIntField(term4266339, term4266339.getClass(), "lastPlayMode", 958723769);
        setIntField(term4266339, term4266339.getClass(), "lastPlaceId", 642358381);
        setField(term4266339, term4266339.getClass(), "lastPlaceName", "TFzItlCuYb");
        setIntField(term4266339, term4266339.getClass(), "lastAllNetId", -1927142239);
        setIntField(term4266339, term4266339.getClass(), "lastRegionId", 1426983497);
        setField(term4266339, term4266339.getClass(), "lastRegionName", "mMBYzaRpQB");
        setField(term4266339, term4266339.getClass(), "lastClientId", "FcLqvkWZDj");
        setField(term4266339, term4266339.getClass(), "lastCountryCode", "jnsAZWZdor");
        setIntField(term4266339, term4266339.getClass(), "lastSelectEMoney", 1415245768);
        setIntField(term4266339, term4266339.getClass(), "lastSelectTicket", -859784998);
        setIntField(term4266339, term4266339.getClass(), "lastSelectCourse", -214683511);
        setIntField(term4266339, term4266339.getClass(), "lastCountCourse", 575750624);
        setField(term4266339, term4266339.getClass(), "firstGameId", "jEbCEWkIGF");
        setField(term4266339, term4266339.getClass(), "firstRomVersion", "UGIuBpqDGu");
        setField(term4266339, term4266339.getClass(), "firstDataVersion", "rfTKPfboTS");
        setField(term4266339, term4266339.getClass(), "firstPlayDate", "rQTBIdCVQL");
        setField(term4266339, term4266339.getClass(), "compatibleCmVersion", "ZkdleyHlfY");
        setField(term4266339, term4266339.getClass(), "dailyBonusDate", "tKcqYxiXAx");
        setField(term4266339, term4266339.getClass(), "dailyCourseBonusDate", "OfANKIFvbS");
        setField(term4266339, term4266339.getClass(), "lastPairLoginDate", "ayVkrhbdwb");
        setField(term4266339, term4266339.getClass(), "lastTrialPlayDate", "bFKAemRuIG");
        setIntField(term4266339, term4266339.getClass(), "playVsCount", 529141368);
        setIntField(term4266339, term4266339.getClass(), "playSyncCount", 2126273955);
        setIntField(term4266339, term4266339.getClass(), "winCount", -562428331);
        setIntField(term4266339, term4266339.getClass(), "helpCount", -1794296896);
        setIntField(term4266339, term4266339.getClass(), "comboCount", 920040853);
        setLongField(term4266339, term4266339.getClass(), "totalDeluxscore", 764704801718464506L);
        setLongField(term4266339, term4266339.getClass(), "totalBasicDeluxscore", -6494199942903260110L);
        setLongField(term4266339, term4266339.getClass(), "totalAdvancedDeluxscore", 2808894741442678271L);
        setLongField(term4266339, term4266339.getClass(), "totalExpertDeluxscore", -475081440367133796L);
        setLongField(term4266339, term4266339.getClass(), "totalMasterDeluxscore", 3245537241894774869L);
        setLongField(term4266339, term4266339.getClass(), "totalReMasterDeluxscore", -4473641647680843294L);
        setIntField(term4266339, term4266339.getClass(), "totalSync", -482655217);
        setIntField(term4266339, term4266339.getClass(), "totalBasicSync", 1280682921);
        setIntField(term4266339, term4266339.getClass(), "totalAdvancedSync", 1465133248);
        setIntField(term4266339, term4266339.getClass(), "totalExpertSync", -1885134476);
        setIntField(term4266339, term4266339.getClass(), "totalMasterSync", 589114857);
        setIntField(term4266339, term4266339.getClass(), "totalReMasterSync", -1625378420);
        setLongField(term4266339, term4266339.getClass(), "totalAchievement", 6881355797677484452L);
        setLongField(term4266339, term4266339.getClass(), "totalBasicAchievement", 5874266604320487216L);
        setLongField(term4266339, term4266339.getClass(), "totalAdvancedAchievement", 7771915536313287616L);
        setLongField(term4266339, term4266339.getClass(), "totalExpertAchievement", -7821912115923527032L);
        setLongField(term4266339, term4266339.getClass(), "totalMasterAchievement", -3130082163836841976L);
        setLongField(term4266339, term4266339.getClass(), "totalReMasterAchievement", -2710569954548780347L);
        setLongField(term4266339, term4266339.getClass(), "playerOldRating", 3489691164789199379L);
        setLongField(term4266339, term4266339.getClass(), "playerNewRating", 6004241040431807452L);
        setIntField(term4266339, term4266339.getClass(), "banState", -1659762675);
        setLongField(term4266339, term4266339.getClass(), "dateTime", -3383655495355531128L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTotalMasterSync", argTypes, term4266339, args);
    }

};


