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

public class UserFriendSeasonRanking_getUserName_11079992957 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18917;

    public UserFriendSeasonRanking_getUserName_11079992957() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term18923 = new Long(5262507301787091109L);
        Integer term18986 = new Integer(1166710220);
        Integer term18988 = new Integer(-1070592289);
        Integer term18990 = new Integer(-1464172784);
        Integer term18992 = new Integer(32185364);
        Integer term18994 = new Integer(1768204942);
        Integer term18996 = new Integer(1252951645);
        ArrayList term18984 = new ArrayList();
        ((ArrayList) term18984).add(term18986);
        ((ArrayList) term18984).add(term18988);
        ((ArrayList) term18984).add(term18990);
        ((ArrayList) term18984).add(term18992);
        ((ArrayList) term18984).add(term18994);
        ((ArrayList) term18984).add(term18996);
        Integer term19002 = new Integer(574481092);
        Integer term19004 = new Integer(-310528004);
        Integer term19006 = new Integer(-634976996);
        Integer term19008 = new Integer(-1015274146);
        Integer term19010 = new Integer(-49052672);
        Integer term19012 = new Integer(339372704);
        ArrayList term19000 = new ArrayList();
        ((ArrayList) term19000).add(term19002);
        ((ArrayList) term19000).add(term19004);
        ((ArrayList) term19000).add(term19006);
        ((ArrayList) term19000).add(term19008);
        ((ArrayList) term19000).add(term19010);
        ((ArrayList) term19000).add(term19012);
        term18917 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserFriendSeasonRanking"));
        Object term18919 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term18921 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term18937 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term18938 = newInstance(Class.forName("java.time.LocalDate"));
        Object term18942 = newInstance(Class.forName("java.time.LocalTime"));
        Object term18947 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term18948 = newInstance(Class.forName("java.time.LocalDate"));
        Object term18952 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term18917, term18917.getClass(), "id", 2712394591642260550L);
        setLongField(term18919, term18919.getClass(), "id", -1211273460223868511L);
        setLongField(term18921, term18921.getClass(), "id", -8172564209423941839L);
        setField(term18921, term18921.getClass(), "extId", term18923);
        setField(term18921, term18921.getClass(), "luid", "TVxGTjeDcu");
        setIntField(term18938, term18938.getClass(), "year", 2028);
        setShortField(term18938, term18938.getClass(), "month", (short) 1);
        setShortField(term18938, term18938.getClass(), "day", (short) 18);
        setField(term18937, term18937.getClass(), "date", term18938);
        setByteField(term18942, term18942.getClass(), "hour", (byte) 12);
        setByteField(term18942, term18942.getClass(), "minute", (byte) 4);
        setByteField(term18942, term18942.getClass(), "second", (byte) 39);
        setIntField(term18942, term18942.getClass(), "nano", 651287093);
        setField(term18937, term18937.getClass(), "time", term18942);
        setField(term18921, term18921.getClass(), "registerTime", term18937);
        setIntField(term18948, term18948.getClass(), "year", 2027);
        setShortField(term18948, term18948.getClass(), "month", (short) 7);
        setShortField(term18948, term18948.getClass(), "day", (short) 23);
        setField(term18947, term18947.getClass(), "date", term18948);
        setByteField(term18952, term18952.getClass(), "hour", (byte) 12);
        setByteField(term18952, term18952.getClass(), "minute", (byte) 6);
        setByteField(term18952, term18952.getClass(), "second", (byte) 19);
        setIntField(term18952, term18952.getClass(), "nano", 8025683);
        setField(term18947, term18947.getClass(), "time", term18952);
        setField(term18921, term18921.getClass(), "accessTime", term18947);
        setField(term18919, term18919.getClass(), "card", term18921);
        setField(term18919, term18919.getClass(), "userName", "ABPtcyCzkR");
        setIntField(term18919, term18919.getClass(), "isNetMember", -1458890291);
        setIntField(term18919, term18919.getClass(), "iconId", 1016087323);
        setIntField(term18919, term18919.getClass(), "plateId", 1957748979);
        setIntField(term18919, term18919.getClass(), "titleId", -1290093259);
        setIntField(term18919, term18919.getClass(), "partnerId", -1200934890);
        setIntField(term18919, term18919.getClass(), "frameId", 1765633108);
        setIntField(term18919, term18919.getClass(), "selectMapId", 1312888741);
        setIntField(term18919, term18919.getClass(), "totalAwake", -1443680397);
        setIntField(term18919, term18919.getClass(), "gradeRating", -1331169079);
        setIntField(term18919, term18919.getClass(), "musicRating", 1109050836);
        setIntField(term18919, term18919.getClass(), "playerRating", 1978065000);
        setIntField(term18919, term18919.getClass(), "highestRating", -2121133707);
        setIntField(term18919, term18919.getClass(), "gradeRank", -1005498887);
        setIntField(term18919, term18919.getClass(), "classRank", 1329150584);
        setIntField(term18919, term18919.getClass(), "courseRank", -1825382367);
        setField(term18919, term18919.getClass(), "charaSlot", term18984);
        setField(term18919, term18919.getClass(), "charaLockSlot", term19000);
        setLongField(term18919, term18919.getClass(), "contentBit", -4561371668792438386L);
        setIntField(term18919, term18919.getClass(), "playCount", -1791371074);
        setField(term18919, term18919.getClass(), "eventWatchedDate", "QgHhxMyKvr");
        setField(term18919, term18919.getClass(), "lastGameId", "VGiXZZTWRO");
        setField(term18919, term18919.getClass(), "lastRomVersion", "MlPtwXnJOJ");
        setField(term18919, term18919.getClass(), "lastDataVersion", "DbfiyFeaTe");
        setField(term18919, term18919.getClass(), "lastLoginDate", "dQxXGBtDLZ");
        setField(term18919, term18919.getClass(), "lastPlayDate", "EgSgEFIyyN");
        setIntField(term18919, term18919.getClass(), "lastPlayCredit", -1151122332);
        setIntField(term18919, term18919.getClass(), "lastPlayMode", 953387911);
        setIntField(term18919, term18919.getClass(), "lastPlaceId", -1550025613);
        setField(term18919, term18919.getClass(), "lastPlaceName", "iAOFcXaLSf");
        setIntField(term18919, term18919.getClass(), "lastAllNetId", 814617314);
        setIntField(term18919, term18919.getClass(), "lastRegionId", -159489307);
        setField(term18919, term18919.getClass(), "lastRegionName", "EHoNUaeyvT");
        setField(term18919, term18919.getClass(), "lastClientId", "ZwKmasCVIy");
        setField(term18919, term18919.getClass(), "lastCountryCode", "pxokrVaeMd");
        setIntField(term18919, term18919.getClass(), "lastSelectEMoney", 1317020952);
        setIntField(term18919, term18919.getClass(), "lastSelectTicket", -742710703);
        setIntField(term18919, term18919.getClass(), "lastSelectCourse", -355505521);
        setIntField(term18919, term18919.getClass(), "lastCountCourse", 1227316523);
        setField(term18919, term18919.getClass(), "firstGameId", "ujxmmZZcbT");
        setField(term18919, term18919.getClass(), "firstRomVersion", "BOvgwHfoHQ");
        setField(term18919, term18919.getClass(), "firstDataVersion", "hPpFNeDBIb");
        setField(term18919, term18919.getClass(), "firstPlayDate", "DNOtiLPAIY");
        setField(term18919, term18919.getClass(), "compatibleCmVersion", "FnEkAHBfyV");
        setField(term18919, term18919.getClass(), "dailyBonusDate", "VfmNFpEuax");
        setField(term18919, term18919.getClass(), "dailyCourseBonusDate", "ANHjlWPmZG");
        setField(term18919, term18919.getClass(), "lastPairLoginDate", "SibzENsyyy");
        setField(term18919, term18919.getClass(), "lastTrialPlayDate", "mrqGHotaef");
        setIntField(term18919, term18919.getClass(), "playVsCount", -58633039);
        setIntField(term18919, term18919.getClass(), "playSyncCount", 448061908);
        setIntField(term18919, term18919.getClass(), "winCount", -1268483887);
        setIntField(term18919, term18919.getClass(), "helpCount", -1929689681);
        setIntField(term18919, term18919.getClass(), "comboCount", -91240911);
        setLongField(term18919, term18919.getClass(), "totalDeluxscore", 7065003857377879971L);
        setLongField(term18919, term18919.getClass(), "totalBasicDeluxscore", 2243864141567980599L);
        setLongField(term18919, term18919.getClass(), "totalAdvancedDeluxscore", 353705949229610067L);
        setLongField(term18919, term18919.getClass(), "totalExpertDeluxscore", 3288572082902580031L);
        setLongField(term18919, term18919.getClass(), "totalMasterDeluxscore", -8698230272673009418L);
        setLongField(term18919, term18919.getClass(), "totalReMasterDeluxscore", -8792567429538693571L);
        setIntField(term18919, term18919.getClass(), "totalSync", -321227954);
        setIntField(term18919, term18919.getClass(), "totalBasicSync", 373810833);
        setIntField(term18919, term18919.getClass(), "totalAdvancedSync", -215979293);
        setIntField(term18919, term18919.getClass(), "totalExpertSync", -19567889);
        setIntField(term18919, term18919.getClass(), "totalMasterSync", 693500318);
        setIntField(term18919, term18919.getClass(), "totalReMasterSync", 1702404702);
        setLongField(term18919, term18919.getClass(), "totalAchievement", 3810487266967550400L);
        setLongField(term18919, term18919.getClass(), "totalBasicAchievement", 8965244485590834147L);
        setLongField(term18919, term18919.getClass(), "totalAdvancedAchievement", -4825509285016265943L);
        setLongField(term18919, term18919.getClass(), "totalExpertAchievement", -1283563319051310751L);
        setLongField(term18919, term18919.getClass(), "totalMasterAchievement", -1413653349314156044L);
        setLongField(term18919, term18919.getClass(), "totalReMasterAchievement", 742593745847006219L);
        setLongField(term18919, term18919.getClass(), "playerOldRating", 6801904611028883308L);
        setLongField(term18919, term18919.getClass(), "playerNewRating", -7717027128782374599L);
        setIntField(term18919, term18919.getClass(), "banState", 1141592999);
        setLongField(term18919, term18919.getClass(), "dateTime", 4872921045907555824L);
        setField(term18917, term18917.getClass(), "user", term18919);
        setIntField(term18917, term18917.getClass(), "seasonId", 848113442);
        setIntField(term18917, term18917.getClass(), "point", 793974213);
        setIntField(term18917, term18917.getClass(), "rank", 722546287);
        setBooleanField(term18917, term18917.getClass(), "rewardGet", true);
        setField(term18917, term18917.getClass(), "userName", "UbZGBpQZQW");
        setField(term18917, term18917.getClass(), "recordDate", "SvGTualQPa");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserFriendSeasonRanking");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getUserName", argTypes, term18917, args);
    }

};


