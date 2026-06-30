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

public class UserExtend_getEncountMapNpcList_67615784016 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term150912;

    public UserExtend_getEncountMapNpcList_67615784016() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term150918 = new Long(1253549421411622358L);
        Integer term150981 = new Integer(-824893512);
        Integer term150983 = new Integer(-55435071);
        Integer term150985 = new Integer(-673356166);
        Integer term150987 = new Integer(1876812694);
        Integer term150989 = new Integer(461068473);
        Integer term150991 = new Integer(-1833298266);
        ArrayList term150979 = new ArrayList();
        ((ArrayList) term150979).add(term150981);
        ((ArrayList) term150979).add(term150983);
        ((ArrayList) term150979).add(term150985);
        ((ArrayList) term150979).add(term150987);
        ((ArrayList) term150979).add(term150989);
        ((ArrayList) term150979).add(term150991);
        Integer term150997 = new Integer(746372422);
        Integer term150999 = new Integer(1921465988);
        Integer term151001 = new Integer(-164438599);
        Integer term151003 = new Integer(-444441955);
        Integer term151005 = new Integer(-544005591);
        Integer term151007 = new Integer(-1379603462);
        ArrayList term150995 = new ArrayList();
        ((ArrayList) term150995).add(term150997);
        ((ArrayList) term150995).add(term150999);
        ((ArrayList) term150995).add(term151001);
        ((ArrayList) term150995).add(term151003);
        ((ArrayList) term150995).add(term151005);
        ((ArrayList) term150995).add(term151007);
        ArrayList term151289 = new ArrayList();
        ArrayList term151293 = new ArrayList();
        term150912 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserExtend"));
        Object term150914 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term150916 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term150932 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term150933 = newInstance(Class.forName("java.time.LocalDate"));
        Object term150937 = newInstance(Class.forName("java.time.LocalTime"));
        Object term150942 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term150943 = newInstance(Class.forName("java.time.LocalDate"));
        Object term150947 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term150912, term150912.getClass(), "id", 2950705058268615439L);
        setLongField(term150914, term150914.getClass(), "id", -6699204182676311982L);
        setLongField(term150916, term150916.getClass(), "id", 8412486208505279309L);
        setField(term150916, term150916.getClass(), "extId", term150918);
        setField(term150916, term150916.getClass(), "luid", "COSohDlJwZ");
        setIntField(term150933, term150933.getClass(), "year", 2026);
        setShortField(term150933, term150933.getClass(), "month", (short) 2);
        setShortField(term150933, term150933.getClass(), "day", (short) 5);
        setField(term150932, term150932.getClass(), "date", term150933);
        setByteField(term150937, term150937.getClass(), "hour", (byte) 8);
        setByteField(term150937, term150937.getClass(), "minute", (byte) 6);
        setByteField(term150937, term150937.getClass(), "second", (byte) 3);
        setIntField(term150937, term150937.getClass(), "nano", 107243113);
        setField(term150932, term150932.getClass(), "time", term150937);
        setField(term150916, term150916.getClass(), "registerTime", term150932);
        setIntField(term150943, term150943.getClass(), "year", 2013);
        setShortField(term150943, term150943.getClass(), "month", (short) 3);
        setShortField(term150943, term150943.getClass(), "day", (short) 17);
        setField(term150942, term150942.getClass(), "date", term150943);
        setByteField(term150947, term150947.getClass(), "hour", (byte) 6);
        setByteField(term150947, term150947.getClass(), "minute", (byte) 13);
        setByteField(term150947, term150947.getClass(), "second", (byte) 20);
        setIntField(term150947, term150947.getClass(), "nano", 748150546);
        setField(term150942, term150942.getClass(), "time", term150947);
        setField(term150916, term150916.getClass(), "accessTime", term150942);
        setField(term150914, term150914.getClass(), "card", term150916);
        setField(term150914, term150914.getClass(), "userName", "mnrQVzZjuq");
        setIntField(term150914, term150914.getClass(), "isNetMember", 633732117);
        setIntField(term150914, term150914.getClass(), "iconId", 2061669437);
        setIntField(term150914, term150914.getClass(), "plateId", 1974184760);
        setIntField(term150914, term150914.getClass(), "titleId", -2074909519);
        setIntField(term150914, term150914.getClass(), "partnerId", -1055211106);
        setIntField(term150914, term150914.getClass(), "frameId", -1730335296);
        setIntField(term150914, term150914.getClass(), "selectMapId", -891933643);
        setIntField(term150914, term150914.getClass(), "totalAwake", -1896713868);
        setIntField(term150914, term150914.getClass(), "gradeRating", -461903855);
        setIntField(term150914, term150914.getClass(), "musicRating", -865104705);
        setIntField(term150914, term150914.getClass(), "playerRating", -871992654);
        setIntField(term150914, term150914.getClass(), "highestRating", 2144355880);
        setIntField(term150914, term150914.getClass(), "gradeRank", -1872843252);
        setIntField(term150914, term150914.getClass(), "classRank", -1245312089);
        setIntField(term150914, term150914.getClass(), "courseRank", -1415132995);
        setField(term150914, term150914.getClass(), "charaSlot", term150979);
        setField(term150914, term150914.getClass(), "charaLockSlot", term150995);
        setLongField(term150914, term150914.getClass(), "contentBit", -5251357731935203502L);
        setIntField(term150914, term150914.getClass(), "playCount", -298988561);
        setField(term150914, term150914.getClass(), "eventWatchedDate", "SwynsBLJcI");
        setField(term150914, term150914.getClass(), "lastGameId", "yXgTitaDXW");
        setField(term150914, term150914.getClass(), "lastRomVersion", "qiYIlJidwz");
        setField(term150914, term150914.getClass(), "lastDataVersion", "bTxEkaNhzD");
        setField(term150914, term150914.getClass(), "lastLoginDate", "GJhlvPIEzj");
        setField(term150914, term150914.getClass(), "lastPlayDate", "JxjbIphmRX");
        setIntField(term150914, term150914.getClass(), "lastPlayCredit", 83719437);
        setIntField(term150914, term150914.getClass(), "lastPlayMode", 992945340);
        setIntField(term150914, term150914.getClass(), "lastPlaceId", -1487299154);
        setField(term150914, term150914.getClass(), "lastPlaceName", "igspPNkvLc");
        setIntField(term150914, term150914.getClass(), "lastAllNetId", 1803636451);
        setIntField(term150914, term150914.getClass(), "lastRegionId", -409541287);
        setField(term150914, term150914.getClass(), "lastRegionName", "BaRcksFiYp");
        setField(term150914, term150914.getClass(), "lastClientId", "qCsUoglQjM");
        setField(term150914, term150914.getClass(), "lastCountryCode", "BVcWJbDXrQ");
        setIntField(term150914, term150914.getClass(), "lastSelectEMoney", -294350291);
        setIntField(term150914, term150914.getClass(), "lastSelectTicket", 741222064);
        setIntField(term150914, term150914.getClass(), "lastSelectCourse", -1480233398);
        setIntField(term150914, term150914.getClass(), "lastCountCourse", 735898654);
        setField(term150914, term150914.getClass(), "firstGameId", "PNxbmyThZc");
        setField(term150914, term150914.getClass(), "firstRomVersion", "fdRVcZbqUf");
        setField(term150914, term150914.getClass(), "firstDataVersion", "aSUSvETRSv");
        setField(term150914, term150914.getClass(), "firstPlayDate", "daQciREiuI");
        setField(term150914, term150914.getClass(), "compatibleCmVersion", "AFRfAPZdqf");
        setField(term150914, term150914.getClass(), "dailyBonusDate", "cZrxYHSQhL");
        setField(term150914, term150914.getClass(), "dailyCourseBonusDate", "fhPRWcwAlA");
        setField(term150914, term150914.getClass(), "lastPairLoginDate", "hNoRxfoxPM");
        setField(term150914, term150914.getClass(), "lastTrialPlayDate", "AkemusjkVp");
        setIntField(term150914, term150914.getClass(), "playVsCount", -1440883870);
        setIntField(term150914, term150914.getClass(), "playSyncCount", -1201667200);
        setIntField(term150914, term150914.getClass(), "winCount", -1698014200);
        setIntField(term150914, term150914.getClass(), "helpCount", -1048905765);
        setIntField(term150914, term150914.getClass(), "comboCount", 196993945);
        setLongField(term150914, term150914.getClass(), "totalDeluxscore", 3736283980701877186L);
        setLongField(term150914, term150914.getClass(), "totalBasicDeluxscore", 1223577998790065069L);
        setLongField(term150914, term150914.getClass(), "totalAdvancedDeluxscore", -6045087572534678483L);
        setLongField(term150914, term150914.getClass(), "totalExpertDeluxscore", -5928264122876451158L);
        setLongField(term150914, term150914.getClass(), "totalMasterDeluxscore", 4756385830485408859L);
        setLongField(term150914, term150914.getClass(), "totalReMasterDeluxscore", -3950460049239125314L);
        setIntField(term150914, term150914.getClass(), "totalSync", 1692789621);
        setIntField(term150914, term150914.getClass(), "totalBasicSync", 1024925524);
        setIntField(term150914, term150914.getClass(), "totalAdvancedSync", 1138562815);
        setIntField(term150914, term150914.getClass(), "totalExpertSync", -1468904016);
        setIntField(term150914, term150914.getClass(), "totalMasterSync", -1831885121);
        setIntField(term150914, term150914.getClass(), "totalReMasterSync", -1987064146);
        setLongField(term150914, term150914.getClass(), "totalAchievement", 8508777815516345581L);
        setLongField(term150914, term150914.getClass(), "totalBasicAchievement", 4480527095346631658L);
        setLongField(term150914, term150914.getClass(), "totalAdvancedAchievement", -1445651963846059939L);
        setLongField(term150914, term150914.getClass(), "totalExpertAchievement", -3260791775172267423L);
        setLongField(term150914, term150914.getClass(), "totalMasterAchievement", -4716553451942082494L);
        setLongField(term150914, term150914.getClass(), "totalReMasterAchievement", -5284180216648117395L);
        setLongField(term150914, term150914.getClass(), "playerOldRating", -8953515687010684205L);
        setLongField(term150914, term150914.getClass(), "playerNewRating", 7677810816137038994L);
        setIntField(term150914, term150914.getClass(), "banState", 184016080);
        setLongField(term150914, term150914.getClass(), "dateTime", -8965065206212832087L);
        setField(term150912, term150912.getClass(), "user", term150914);
        setIntField(term150912, term150912.getClass(), "selectMusicId", -2083206845);
        setIntField(term150912, term150912.getClass(), "selectDifficultyId", -1045178381);
        setIntField(term150912, term150912.getClass(), "categoryIndex", -1427049200);
        setIntField(term150912, term150912.getClass(), "musicIndex", -911265650);
        setIntField(term150912, term150912.getClass(), "extraFlag", 218864889);
        setIntField(term150912, term150912.getClass(), "selectScoreType", -1988994618);
        setLongField(term150912, term150912.getClass(), "extendContentBit", 4809452600034493683L);
        setBooleanField(term150912, term150912.getClass(), "isPhotoAgree", false);
        setBooleanField(term150912, term150912.getClass(), "isGotoCodeRead", false);
        setBooleanField(term150912, term150912.getClass(), "selectResultDetails", true);
        setIntField(term150912, term150912.getClass(), "sortCategorySetting", 1551865443);
        setIntField(term150912, term150912.getClass(), "sortMusicSetting", -1883739433);
        setField(term150912, term150912.getClass(), "selectedCardList", term151289);
        setField(term150912, term150912.getClass(), "encountMapNpcList", term151293);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserExtend");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getEncountMapNpcList", argTypes, term150912, args);
    }

};


