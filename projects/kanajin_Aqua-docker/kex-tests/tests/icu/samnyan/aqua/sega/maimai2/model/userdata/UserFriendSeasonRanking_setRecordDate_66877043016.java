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

public class UserFriendSeasonRanking_setRecordDate_66877043016 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25035;

    public UserFriendSeasonRanking_setRecordDate_66877043016() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term25041 = new Long(-6292278961887936280L);
        Integer term25104 = new Integer(-938508470);
        Integer term25106 = new Integer(1242676024);
        Integer term25108 = new Integer(-1865023308);
        Integer term25110 = new Integer(1698510819);
        Integer term25112 = new Integer(-1553893255);
        Integer term25114 = new Integer(1303442927);
        ArrayList term25102 = new ArrayList();
        ((ArrayList) term25102).add(term25104);
        ((ArrayList) term25102).add(term25106);
        ((ArrayList) term25102).add(term25108);
        ((ArrayList) term25102).add(term25110);
        ((ArrayList) term25102).add(term25112);
        ((ArrayList) term25102).add(term25114);
        Integer term25120 = new Integer(794568325);
        Integer term25122 = new Integer(-434468428);
        Integer term25124 = new Integer(1559605714);
        Integer term25126 = new Integer(1146601902);
        Integer term25128 = new Integer(-1938881385);
        Integer term25130 = new Integer(-1629418973);
        Integer term25132 = new Integer(-100825168);
        ArrayList term25118 = new ArrayList();
        ((ArrayList) term25118).add(term25120);
        ((ArrayList) term25118).add(term25122);
        ((ArrayList) term25118).add(term25124);
        ((ArrayList) term25118).add(term25126);
        ((ArrayList) term25118).add(term25128);
        ((ArrayList) term25118).add(term25130);
        ((ArrayList) term25118).add(term25132);
        term25035 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserFriendSeasonRanking"));
        Object term25037 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term25039 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term25055 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term25056 = newInstance(Class.forName("java.time.LocalDate"));
        Object term25060 = newInstance(Class.forName("java.time.LocalTime"));
        Object term25065 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term25066 = newInstance(Class.forName("java.time.LocalDate"));
        Object term25070 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term25035, term25035.getClass(), "id", -1572808624189549793L);
        setLongField(term25037, term25037.getClass(), "id", -6151316713456472560L);
        setLongField(term25039, term25039.getClass(), "id", -5597498165246748176L);
        setField(term25039, term25039.getClass(), "extId", term25041);
        setField(term25039, term25039.getClass(), "luid", "scpIQUfPKw");
        setIntField(term25056, term25056.getClass(), "year", 2020);
        setShortField(term25056, term25056.getClass(), "month", (short) 5);
        setShortField(term25056, term25056.getClass(), "day", (short) 12);
        setField(term25055, term25055.getClass(), "date", term25056);
        setByteField(term25060, term25060.getClass(), "hour", (byte) 0);
        setByteField(term25060, term25060.getClass(), "minute", (byte) 15);
        setByteField(term25060, term25060.getClass(), "second", (byte) 24);
        setIntField(term25060, term25060.getClass(), "nano", 250257744);
        setField(term25055, term25055.getClass(), "time", term25060);
        setField(term25039, term25039.getClass(), "registerTime", term25055);
        setIntField(term25066, term25066.getClass(), "year", 2013);
        setShortField(term25066, term25066.getClass(), "month", (short) 9);
        setShortField(term25066, term25066.getClass(), "day", (short) 19);
        setField(term25065, term25065.getClass(), "date", term25066);
        setByteField(term25070, term25070.getClass(), "hour", (byte) 12);
        setByteField(term25070, term25070.getClass(), "minute", (byte) 29);
        setByteField(term25070, term25070.getClass(), "second", (byte) 28);
        setIntField(term25070, term25070.getClass(), "nano", 244069764);
        setField(term25065, term25065.getClass(), "time", term25070);
        setField(term25039, term25039.getClass(), "accessTime", term25065);
        setField(term25037, term25037.getClass(), "card", term25039);
        setField(term25037, term25037.getClass(), "userName", "QKYBpCjuYt");
        setIntField(term25037, term25037.getClass(), "isNetMember", 198857801);
        setIntField(term25037, term25037.getClass(), "iconId", 1342884142);
        setIntField(term25037, term25037.getClass(), "plateId", -1454325068);
        setIntField(term25037, term25037.getClass(), "titleId", 346714653);
        setIntField(term25037, term25037.getClass(), "partnerId", 2121928697);
        setIntField(term25037, term25037.getClass(), "frameId", -1741056571);
        setIntField(term25037, term25037.getClass(), "selectMapId", 522501050);
        setIntField(term25037, term25037.getClass(), "totalAwake", 125432890);
        setIntField(term25037, term25037.getClass(), "gradeRating", -197740561);
        setIntField(term25037, term25037.getClass(), "musicRating", -1811706962);
        setIntField(term25037, term25037.getClass(), "playerRating", -1242133071);
        setIntField(term25037, term25037.getClass(), "highestRating", -455052015);
        setIntField(term25037, term25037.getClass(), "gradeRank", -1322797287);
        setIntField(term25037, term25037.getClass(), "classRank", -615198242);
        setIntField(term25037, term25037.getClass(), "courseRank", -491132382);
        setField(term25037, term25037.getClass(), "charaSlot", term25102);
        setField(term25037, term25037.getClass(), "charaLockSlot", term25118);
        setLongField(term25037, term25037.getClass(), "contentBit", 6174523862926526279L);
        setIntField(term25037, term25037.getClass(), "playCount", 918882916);
        setField(term25037, term25037.getClass(), "eventWatchedDate", "vjiRfoGdkl");
        setField(term25037, term25037.getClass(), "lastGameId", "TwaxeSHvnR");
        setField(term25037, term25037.getClass(), "lastRomVersion", "paPzDETzIq");
        setField(term25037, term25037.getClass(), "lastDataVersion", "fufeuGfwpN");
        setField(term25037, term25037.getClass(), "lastLoginDate", "XJbkXbljvz");
        setField(term25037, term25037.getClass(), "lastPlayDate", "fuvdkDwBeH");
        setIntField(term25037, term25037.getClass(), "lastPlayCredit", 1544012770);
        setIntField(term25037, term25037.getClass(), "lastPlayMode", 1922068039);
        setIntField(term25037, term25037.getClass(), "lastPlaceId", -410564443);
        setField(term25037, term25037.getClass(), "lastPlaceName", "NTefzwLPhx");
        setIntField(term25037, term25037.getClass(), "lastAllNetId", 996017434);
        setIntField(term25037, term25037.getClass(), "lastRegionId", -983870300);
        setField(term25037, term25037.getClass(), "lastRegionName", "dirFuhqyNu");
        setField(term25037, term25037.getClass(), "lastClientId", "YVLRenzuoR");
        setField(term25037, term25037.getClass(), "lastCountryCode", "JukEMhPWql");
        setIntField(term25037, term25037.getClass(), "lastSelectEMoney", 360715062);
        setIntField(term25037, term25037.getClass(), "lastSelectTicket", 1047409266);
        setIntField(term25037, term25037.getClass(), "lastSelectCourse", 1427248961);
        setIntField(term25037, term25037.getClass(), "lastCountCourse", 1445291866);
        setField(term25037, term25037.getClass(), "firstGameId", "ZdNcodHERG");
        setField(term25037, term25037.getClass(), "firstRomVersion", "CLHomjAqIM");
        setField(term25037, term25037.getClass(), "firstDataVersion", "mzCFLzFuSj");
        setField(term25037, term25037.getClass(), "firstPlayDate", "WQnMpDlSfA");
        setField(term25037, term25037.getClass(), "compatibleCmVersion", "aOIvTQtXiv");
        setField(term25037, term25037.getClass(), "dailyBonusDate", "IyjDiknqhA");
        setField(term25037, term25037.getClass(), "dailyCourseBonusDate", "IHsXSAFYKi");
        setField(term25037, term25037.getClass(), "lastPairLoginDate", "KyGbLglqbW");
        setField(term25037, term25037.getClass(), "lastTrialPlayDate", "ZKVeStsSNT");
        setIntField(term25037, term25037.getClass(), "playVsCount", -139927812);
        setIntField(term25037, term25037.getClass(), "playSyncCount", -2065157320);
        setIntField(term25037, term25037.getClass(), "winCount", 1782011477);
        setIntField(term25037, term25037.getClass(), "helpCount", 2129957018);
        setIntField(term25037, term25037.getClass(), "comboCount", 691663312);
        setLongField(term25037, term25037.getClass(), "totalDeluxscore", 4977537501907213732L);
        setLongField(term25037, term25037.getClass(), "totalBasicDeluxscore", -2341942457089205755L);
        setLongField(term25037, term25037.getClass(), "totalAdvancedDeluxscore", -7503147844796296300L);
        setLongField(term25037, term25037.getClass(), "totalExpertDeluxscore", 1099634235456795888L);
        setLongField(term25037, term25037.getClass(), "totalMasterDeluxscore", 5391189846186870864L);
        setLongField(term25037, term25037.getClass(), "totalReMasterDeluxscore", 7314774835988078404L);
        setIntField(term25037, term25037.getClass(), "totalSync", -1236696275);
        setIntField(term25037, term25037.getClass(), "totalBasicSync", 575249858);
        setIntField(term25037, term25037.getClass(), "totalAdvancedSync", -297957951);
        setIntField(term25037, term25037.getClass(), "totalExpertSync", -1816920588);
        setIntField(term25037, term25037.getClass(), "totalMasterSync", 1674165862);
        setIntField(term25037, term25037.getClass(), "totalReMasterSync", 1875252647);
        setLongField(term25037, term25037.getClass(), "totalAchievement", 2777168805269959396L);
        setLongField(term25037, term25037.getClass(), "totalBasicAchievement", 5255768275907389358L);
        setLongField(term25037, term25037.getClass(), "totalAdvancedAchievement", -8859332911664940963L);
        setLongField(term25037, term25037.getClass(), "totalExpertAchievement", 7048544371106200955L);
        setLongField(term25037, term25037.getClass(), "totalMasterAchievement", -6299955839293054069L);
        setLongField(term25037, term25037.getClass(), "totalReMasterAchievement", 3573273176206440433L);
        setLongField(term25037, term25037.getClass(), "playerOldRating", 8242382965219431687L);
        setLongField(term25037, term25037.getClass(), "playerNewRating", -3092537062189928451L);
        setIntField(term25037, term25037.getClass(), "banState", -1298688401);
        setLongField(term25037, term25037.getClass(), "dateTime", -6645699856048951433L);
        setField(term25035, term25035.getClass(), "user", term25037);
        setIntField(term25035, term25035.getClass(), "seasonId", 1907832341);
        setIntField(term25035, term25035.getClass(), "point", 932199784);
        setIntField(term25035, term25035.getClass(), "rank", 1953620444);
        setBooleanField(term25035, term25035.getClass(), "rewardGet", true);
        setField(term25035, term25035.getClass(), "userName", "cqCXYaAnFB");
        setField(term25035, term25035.getClass(), "recordDate", "UPLNFZHXjw");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserFriendSeasonRanking");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "CwrrJlrGmg";
        callMethod(klass, "setRecordDate", argTypes, term25035, args);
    }

};


