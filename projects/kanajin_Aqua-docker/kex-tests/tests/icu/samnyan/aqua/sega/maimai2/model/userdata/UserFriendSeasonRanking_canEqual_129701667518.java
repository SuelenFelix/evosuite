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

public class UserFriendSeasonRanking_canEqual_129701667518 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26300;
     Object term26697;

    public UserFriendSeasonRanking_canEqual_129701667518() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term26306 = new Long(4784595517102746672L);
        Integer term26369 = new Integer(1023209512);
        Integer term26371 = new Integer(1084849225);
        Integer term26373 = new Integer(-1702055571);
        Integer term26375 = new Integer(-944542900);
        Integer term26377 = new Integer(2063762142);
        Integer term26379 = new Integer(1658391716);
        ArrayList term26367 = new ArrayList();
        ((ArrayList) term26367).add(term26369);
        ((ArrayList) term26367).add(term26371);
        ((ArrayList) term26367).add(term26373);
        ((ArrayList) term26367).add(term26375);
        ((ArrayList) term26367).add(term26377);
        ((ArrayList) term26367).add(term26379);
        Integer term26385 = new Integer(2143282300);
        Integer term26387 = new Integer(1137624258);
        Integer term26389 = new Integer(977862393);
        Integer term26391 = new Integer(301401782);
        Integer term26393 = new Integer(1988605357);
        Integer term26395 = new Integer(808203320);
        Integer term26397 = new Integer(-544382127);
        Integer term26399 = new Integer(-1830198043);
        ArrayList term26383 = new ArrayList();
        ((ArrayList) term26383).add(term26385);
        ((ArrayList) term26383).add(term26387);
        ((ArrayList) term26383).add(term26389);
        ((ArrayList) term26383).add(term26391);
        ((ArrayList) term26383).add(term26393);
        ((ArrayList) term26383).add(term26395);
        ((ArrayList) term26383).add(term26397);
        ((ArrayList) term26383).add(term26399);
        term26300 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserFriendSeasonRanking"));
        Object term26302 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term26304 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term26320 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term26321 = newInstance(Class.forName("java.time.LocalDate"));
        Object term26325 = newInstance(Class.forName("java.time.LocalTime"));
        Object term26330 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term26331 = newInstance(Class.forName("java.time.LocalDate"));
        Object term26335 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term26300, term26300.getClass(), "id", -6064923943154213519L);
        setLongField(term26302, term26302.getClass(), "id", -6344058468200613078L);
        setLongField(term26304, term26304.getClass(), "id", 9069301103965727560L);
        setField(term26304, term26304.getClass(), "extId", term26306);
        setField(term26304, term26304.getClass(), "luid", "GjdWUoUSyA");
        setIntField(term26321, term26321.getClass(), "year", 2023);
        setShortField(term26321, term26321.getClass(), "month", (short) 5);
        setShortField(term26321, term26321.getClass(), "day", (short) 23);
        setField(term26320, term26320.getClass(), "date", term26321);
        setByteField(term26325, term26325.getClass(), "hour", (byte) 0);
        setByteField(term26325, term26325.getClass(), "minute", (byte) 50);
        setByteField(term26325, term26325.getClass(), "second", (byte) 5);
        setIntField(term26325, term26325.getClass(), "nano", 296286825);
        setField(term26320, term26320.getClass(), "time", term26325);
        setField(term26304, term26304.getClass(), "registerTime", term26320);
        setIntField(term26331, term26331.getClass(), "year", 2015);
        setShortField(term26331, term26331.getClass(), "month", (short) 2);
        setShortField(term26331, term26331.getClass(), "day", (short) 5);
        setField(term26330, term26330.getClass(), "date", term26331);
        setByteField(term26335, term26335.getClass(), "hour", (byte) 3);
        setByteField(term26335, term26335.getClass(), "minute", (byte) 26);
        setByteField(term26335, term26335.getClass(), "second", (byte) 49);
        setIntField(term26335, term26335.getClass(), "nano", 995758570);
        setField(term26330, term26330.getClass(), "time", term26335);
        setField(term26304, term26304.getClass(), "accessTime", term26330);
        setField(term26302, term26302.getClass(), "card", term26304);
        setField(term26302, term26302.getClass(), "userName", "YEkxWsWaUl");
        setIntField(term26302, term26302.getClass(), "isNetMember", 1044519085);
        setIntField(term26302, term26302.getClass(), "iconId", 2095699770);
        setIntField(term26302, term26302.getClass(), "plateId", -1365904757);
        setIntField(term26302, term26302.getClass(), "titleId", -1487263349);
        setIntField(term26302, term26302.getClass(), "partnerId", -1009732764);
        setIntField(term26302, term26302.getClass(), "frameId", 950783153);
        setIntField(term26302, term26302.getClass(), "selectMapId", -801175078);
        setIntField(term26302, term26302.getClass(), "totalAwake", 2085098404);
        setIntField(term26302, term26302.getClass(), "gradeRating", -684064427);
        setIntField(term26302, term26302.getClass(), "musicRating", -1981080836);
        setIntField(term26302, term26302.getClass(), "playerRating", -176676344);
        setIntField(term26302, term26302.getClass(), "highestRating", 1949009312);
        setIntField(term26302, term26302.getClass(), "gradeRank", -432054743);
        setIntField(term26302, term26302.getClass(), "classRank", -859726380);
        setIntField(term26302, term26302.getClass(), "courseRank", -1498422654);
        setField(term26302, term26302.getClass(), "charaSlot", term26367);
        setField(term26302, term26302.getClass(), "charaLockSlot", term26383);
        setLongField(term26302, term26302.getClass(), "contentBit", 1078204819466025938L);
        setIntField(term26302, term26302.getClass(), "playCount", -1499829233);
        setField(term26302, term26302.getClass(), "eventWatchedDate", "RINhPkhhct");
        setField(term26302, term26302.getClass(), "lastGameId", "vjNPcTSqmS");
        setField(term26302, term26302.getClass(), "lastRomVersion", "fFhdWuJbdC");
        setField(term26302, term26302.getClass(), "lastDataVersion", "JlgLIHPabR");
        setField(term26302, term26302.getClass(), "lastLoginDate", "LHnkeoNwHq");
        setField(term26302, term26302.getClass(), "lastPlayDate", "gVnDVbSyKa");
        setIntField(term26302, term26302.getClass(), "lastPlayCredit", -888855662);
        setIntField(term26302, term26302.getClass(), "lastPlayMode", -1483966656);
        setIntField(term26302, term26302.getClass(), "lastPlaceId", -334260786);
        setField(term26302, term26302.getClass(), "lastPlaceName", "kdCYNMSuoD");
        setIntField(term26302, term26302.getClass(), "lastAllNetId", -765890956);
        setIntField(term26302, term26302.getClass(), "lastRegionId", -214452542);
        setField(term26302, term26302.getClass(), "lastRegionName", "eRYlSLwtvV");
        setField(term26302, term26302.getClass(), "lastClientId", "duOyJsARTD");
        setField(term26302, term26302.getClass(), "lastCountryCode", "xPnOHsNlyc");
        setIntField(term26302, term26302.getClass(), "lastSelectEMoney", -21429773);
        setIntField(term26302, term26302.getClass(), "lastSelectTicket", 1774728742);
        setIntField(term26302, term26302.getClass(), "lastSelectCourse", -1822211508);
        setIntField(term26302, term26302.getClass(), "lastCountCourse", -177243872);
        setField(term26302, term26302.getClass(), "firstGameId", "OTSPWPJefj");
        setField(term26302, term26302.getClass(), "firstRomVersion", "EOTYMqXRmE");
        setField(term26302, term26302.getClass(), "firstDataVersion", "iTxNduwSjE");
        setField(term26302, term26302.getClass(), "firstPlayDate", "MQUTfIiFnh");
        setField(term26302, term26302.getClass(), "compatibleCmVersion", "JeyKRznnft");
        setField(term26302, term26302.getClass(), "dailyBonusDate", "vQJUCtuYpK");
        setField(term26302, term26302.getClass(), "dailyCourseBonusDate", "GHtOeztAdz");
        setField(term26302, term26302.getClass(), "lastPairLoginDate", "gSAtqakaLY");
        setField(term26302, term26302.getClass(), "lastTrialPlayDate", "taPBiMFNEZ");
        setIntField(term26302, term26302.getClass(), "playVsCount", 1485047282);
        setIntField(term26302, term26302.getClass(), "playSyncCount", 1624190794);
        setIntField(term26302, term26302.getClass(), "winCount", -773608881);
        setIntField(term26302, term26302.getClass(), "helpCount", -1642688455);
        setIntField(term26302, term26302.getClass(), "comboCount", -1184558215);
        setLongField(term26302, term26302.getClass(), "totalDeluxscore", -4526944004625263747L);
        setLongField(term26302, term26302.getClass(), "totalBasicDeluxscore", -8195504192950938590L);
        setLongField(term26302, term26302.getClass(), "totalAdvancedDeluxscore", -3141593811423226559L);
        setLongField(term26302, term26302.getClass(), "totalExpertDeluxscore", 165312735504471081L);
        setLongField(term26302, term26302.getClass(), "totalMasterDeluxscore", 7910323873668469704L);
        setLongField(term26302, term26302.getClass(), "totalReMasterDeluxscore", -8034026767184380879L);
        setIntField(term26302, term26302.getClass(), "totalSync", 2123688338);
        setIntField(term26302, term26302.getClass(), "totalBasicSync", -1051941387);
        setIntField(term26302, term26302.getClass(), "totalAdvancedSync", -640763660);
        setIntField(term26302, term26302.getClass(), "totalExpertSync", -1189468129);
        setIntField(term26302, term26302.getClass(), "totalMasterSync", -1099664830);
        setIntField(term26302, term26302.getClass(), "totalReMasterSync", 873502011);
        setLongField(term26302, term26302.getClass(), "totalAchievement", -1865079020076651952L);
        setLongField(term26302, term26302.getClass(), "totalBasicAchievement", -6255610460583667093L);
        setLongField(term26302, term26302.getClass(), "totalAdvancedAchievement", -3947173237186855838L);
        setLongField(term26302, term26302.getClass(), "totalExpertAchievement", 1186857065042697930L);
        setLongField(term26302, term26302.getClass(), "totalMasterAchievement", 1659080369100392023L);
        setLongField(term26302, term26302.getClass(), "totalReMasterAchievement", 854087753192360238L);
        setLongField(term26302, term26302.getClass(), "playerOldRating", -6246278604466261475L);
        setLongField(term26302, term26302.getClass(), "playerNewRating", 9113614356317836741L);
        setIntField(term26302, term26302.getClass(), "banState", -2004575734);
        setLongField(term26302, term26302.getClass(), "dateTime", 2244124922001093690L);
        setField(term26300, term26300.getClass(), "user", term26302);
        setIntField(term26300, term26300.getClass(), "seasonId", 1491468856);
        setIntField(term26300, term26300.getClass(), "point", 962385185);
        setIntField(term26300, term26300.getClass(), "rank", 2146718886);
        setBooleanField(term26300, term26300.getClass(), "rewardGet", false);
        setField(term26300, term26300.getClass(), "userName", "NoAFAfGyYL");
        setField(term26300, term26300.getClass(), "recordDate", "MFtfkBMyOD");
        term26697 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserFriendSeasonRanking");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term26697;
        callMethod(klass, "canEqual", argTypes, term26300, args);
    }

};


