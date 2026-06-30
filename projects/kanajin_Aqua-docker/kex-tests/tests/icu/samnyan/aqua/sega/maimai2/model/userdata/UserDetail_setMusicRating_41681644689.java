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

public class UserDetail_setMusicRating_41681644689 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4280039;
     Object term4280396;

    public UserDetail_setMusicRating_41681644689() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term4280043 = new Long(-5395570594601954511L);
        Integer term4280106 = new Integer(1838060666);
        Integer term4280108 = new Integer(-1354834639);
        Integer term4280110 = new Integer(1855161601);
        Integer term4280112 = new Integer(1447406432);
        Integer term4280114 = new Integer(-1261622822);
        Integer term4280116 = new Integer(1191113274);
        Integer term4280118 = new Integer(-1722069360);
        ArrayList term4280104 = new ArrayList();
        ((ArrayList) term4280104).add(term4280106);
        ((ArrayList) term4280104).add(term4280108);
        ((ArrayList) term4280104).add(term4280110);
        ((ArrayList) term4280104).add(term4280112);
        ((ArrayList) term4280104).add(term4280114);
        ((ArrayList) term4280104).add(term4280116);
        ((ArrayList) term4280104).add(term4280118);
        Integer term4280124 = new Integer(-1495659787);
        Integer term4280126 = new Integer(-13450873);
        ArrayList term4280122 = new ArrayList();
        ((ArrayList) term4280122).add(term4280124);
        ((ArrayList) term4280122).add(term4280126);
        term4280039 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term4280041 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term4280057 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4280058 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4280062 = newInstance(Class.forName("java.time.LocalTime"));
        Object term4280067 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term4280068 = newInstance(Class.forName("java.time.LocalDate"));
        Object term4280072 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term4280039, term4280039.getClass(), "id", -6319841819845148454L);
        setLongField(term4280041, term4280041.getClass(), "id", 5700084195242200871L);
        setField(term4280041, term4280041.getClass(), "extId", term4280043);
        setField(term4280041, term4280041.getClass(), "luid", "FHFRwGcIeH");
        setIntField(term4280058, term4280058.getClass(), "year", 2019);
        setShortField(term4280058, term4280058.getClass(), "month", (short) 7);
        setShortField(term4280058, term4280058.getClass(), "day", (short) 25);
        setField(term4280057, term4280057.getClass(), "date", term4280058);
        setByteField(term4280062, term4280062.getClass(), "hour", (byte) 23);
        setByteField(term4280062, term4280062.getClass(), "minute", (byte) 39);
        setByteField(term4280062, term4280062.getClass(), "second", (byte) 33);
        setIntField(term4280062, term4280062.getClass(), "nano", 803686164);
        setField(term4280057, term4280057.getClass(), "time", term4280062);
        setField(term4280041, term4280041.getClass(), "registerTime", term4280057);
        setIntField(term4280068, term4280068.getClass(), "year", 2018);
        setShortField(term4280068, term4280068.getClass(), "month", (short) 10);
        setShortField(term4280068, term4280068.getClass(), "day", (short) 25);
        setField(term4280067, term4280067.getClass(), "date", term4280068);
        setByteField(term4280072, term4280072.getClass(), "hour", (byte) 1);
        setByteField(term4280072, term4280072.getClass(), "minute", (byte) 32);
        setByteField(term4280072, term4280072.getClass(), "second", (byte) 3);
        setIntField(term4280072, term4280072.getClass(), "nano", 914915196);
        setField(term4280067, term4280067.getClass(), "time", term4280072);
        setField(term4280041, term4280041.getClass(), "accessTime", term4280067);
        setField(term4280039, term4280039.getClass(), "card", term4280041);
        setField(term4280039, term4280039.getClass(), "userName", "uCitKYfHsm");
        setIntField(term4280039, term4280039.getClass(), "isNetMember", -125226953);
        setIntField(term4280039, term4280039.getClass(), "iconId", -351439875);
        setIntField(term4280039, term4280039.getClass(), "plateId", -2036971945);
        setIntField(term4280039, term4280039.getClass(), "titleId", -1777361247);
        setIntField(term4280039, term4280039.getClass(), "partnerId", -1613624161);
        setIntField(term4280039, term4280039.getClass(), "frameId", 1362354990);
        setIntField(term4280039, term4280039.getClass(), "selectMapId", 118005760);
        setIntField(term4280039, term4280039.getClass(), "totalAwake", 198086676);
        setIntField(term4280039, term4280039.getClass(), "gradeRating", 1533228005);
        setIntField(term4280039, term4280039.getClass(), "musicRating", 774734375);
        setIntField(term4280039, term4280039.getClass(), "playerRating", -2131525699);
        setIntField(term4280039, term4280039.getClass(), "highestRating", 388309265);
        setIntField(term4280039, term4280039.getClass(), "gradeRank", 1669789655);
        setIntField(term4280039, term4280039.getClass(), "classRank", 787277506);
        setIntField(term4280039, term4280039.getClass(), "courseRank", 1681778633);
        setField(term4280039, term4280039.getClass(), "charaSlot", term4280104);
        setField(term4280039, term4280039.getClass(), "charaLockSlot", term4280122);
        setLongField(term4280039, term4280039.getClass(), "contentBit", 86850711313575171L);
        setIntField(term4280039, term4280039.getClass(), "playCount", 1827197113);
        setField(term4280039, term4280039.getClass(), "eventWatchedDate", "PbEvUXpywd");
        setField(term4280039, term4280039.getClass(), "lastGameId", "DGKFIEdPpg");
        setField(term4280039, term4280039.getClass(), "lastRomVersion", "wKeRDREGCa");
        setField(term4280039, term4280039.getClass(), "lastDataVersion", "fxfJoBSzjx");
        setField(term4280039, term4280039.getClass(), "lastLoginDate", "iCmsnmXIQi");
        setField(term4280039, term4280039.getClass(), "lastPlayDate", "hdbNfbLFxw");
        setIntField(term4280039, term4280039.getClass(), "lastPlayCredit", -1129769800);
        setIntField(term4280039, term4280039.getClass(), "lastPlayMode", -1633548915);
        setIntField(term4280039, term4280039.getClass(), "lastPlaceId", -1564198862);
        setField(term4280039, term4280039.getClass(), "lastPlaceName", "GCUEnLEbTO");
        setIntField(term4280039, term4280039.getClass(), "lastAllNetId", -1694108110);
        setIntField(term4280039, term4280039.getClass(), "lastRegionId", 1381693576);
        setField(term4280039, term4280039.getClass(), "lastRegionName", "wqRyuXQhuq");
        setField(term4280039, term4280039.getClass(), "lastClientId", "WJTVmcZfSJ");
        setField(term4280039, term4280039.getClass(), "lastCountryCode", "RhjeqrXzRq");
        setIntField(term4280039, term4280039.getClass(), "lastSelectEMoney", 1782817213);
        setIntField(term4280039, term4280039.getClass(), "lastSelectTicket", 2036470204);
        setIntField(term4280039, term4280039.getClass(), "lastSelectCourse", 1706963901);
        setIntField(term4280039, term4280039.getClass(), "lastCountCourse", 884914824);
        setField(term4280039, term4280039.getClass(), "firstGameId", "mVYzNrAHoj");
        setField(term4280039, term4280039.getClass(), "firstRomVersion", "BSBuTbKaom");
        setField(term4280039, term4280039.getClass(), "firstDataVersion", "IxihfGupLk");
        setField(term4280039, term4280039.getClass(), "firstPlayDate", "aJYznpafEM");
        setField(term4280039, term4280039.getClass(), "compatibleCmVersion", "DzYszzebXE");
        setField(term4280039, term4280039.getClass(), "dailyBonusDate", "MsSNtEIbBE");
        setField(term4280039, term4280039.getClass(), "dailyCourseBonusDate", "cFHAJRlsxQ");
        setField(term4280039, term4280039.getClass(), "lastPairLoginDate", "snvmHUvbji");
        setField(term4280039, term4280039.getClass(), "lastTrialPlayDate", "kVtlSFUTed");
        setIntField(term4280039, term4280039.getClass(), "playVsCount", 120277091);
        setIntField(term4280039, term4280039.getClass(), "playSyncCount", 1878852357);
        setIntField(term4280039, term4280039.getClass(), "winCount", 955418376);
        setIntField(term4280039, term4280039.getClass(), "helpCount", 1160480508);
        setIntField(term4280039, term4280039.getClass(), "comboCount", -23508259);
        setLongField(term4280039, term4280039.getClass(), "totalDeluxscore", -523058465495565343L);
        setLongField(term4280039, term4280039.getClass(), "totalBasicDeluxscore", -5389074707552279640L);
        setLongField(term4280039, term4280039.getClass(), "totalAdvancedDeluxscore", 1675297554609055681L);
        setLongField(term4280039, term4280039.getClass(), "totalExpertDeluxscore", -2985469456921079700L);
        setLongField(term4280039, term4280039.getClass(), "totalMasterDeluxscore", -7407546795214841498L);
        setLongField(term4280039, term4280039.getClass(), "totalReMasterDeluxscore", 8409073148719193955L);
        setIntField(term4280039, term4280039.getClass(), "totalSync", -827694103);
        setIntField(term4280039, term4280039.getClass(), "totalBasicSync", 76384960);
        setIntField(term4280039, term4280039.getClass(), "totalAdvancedSync", 1388741426);
        setIntField(term4280039, term4280039.getClass(), "totalExpertSync", 593063054);
        setIntField(term4280039, term4280039.getClass(), "totalMasterSync", -1563622617);
        setIntField(term4280039, term4280039.getClass(), "totalReMasterSync", 1599585642);
        setLongField(term4280039, term4280039.getClass(), "totalAchievement", -2816586428040075272L);
        setLongField(term4280039, term4280039.getClass(), "totalBasicAchievement", -5305222376906232875L);
        setLongField(term4280039, term4280039.getClass(), "totalAdvancedAchievement", -1182339722561597041L);
        setLongField(term4280039, term4280039.getClass(), "totalExpertAchievement", 7452395029004212034L);
        setLongField(term4280039, term4280039.getClass(), "totalMasterAchievement", 3790019544247686101L);
        setLongField(term4280039, term4280039.getClass(), "totalReMasterAchievement", 3301171899018628262L);
        setLongField(term4280039, term4280039.getClass(), "playerOldRating", 2670132431892785897L);
        setLongField(term4280039, term4280039.getClass(), "playerNewRating", -4741465261839682562L);
        setIntField(term4280039, term4280039.getClass(), "banState", -906531389);
        setLongField(term4280039, term4280039.getClass(), "dateTime", 578192711183211142L);
        term4280396 = new Integer(-988268591);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term4280396;
        callMethod(klass, "setMusicRating", argTypes, term4280039, args);
    }

};


