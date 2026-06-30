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

public class UserFriendSeasonRanking_toString_46659231920 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27543;

    public UserFriendSeasonRanking_toString_46659231920() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term27549 = new Long(-2170847986967241072L);
        Integer term27612 = new Integer(1241164745);
        ArrayList term27610 = new ArrayList();
        ((ArrayList) term27610).add(term27612);
        Integer term27618 = new Integer(1723148410);
        Integer term27620 = new Integer(-920797484);
        Integer term27622 = new Integer(-1631697577);
        Integer term27624 = new Integer(765731371);
        Integer term27626 = new Integer(-1703035419);
        ArrayList term27616 = new ArrayList();
        ((ArrayList) term27616).add(term27618);
        ((ArrayList) term27616).add(term27620);
        ((ArrayList) term27616).add(term27622);
        ((ArrayList) term27616).add(term27624);
        ((ArrayList) term27616).add(term27626);
        term27543 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserFriendSeasonRanking"));
        Object term27545 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term27547 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term27563 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term27564 = newInstance(Class.forName("java.time.LocalDate"));
        Object term27568 = newInstance(Class.forName("java.time.LocalTime"));
        Object term27573 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term27574 = newInstance(Class.forName("java.time.LocalDate"));
        Object term27578 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term27543, term27543.getClass(), "id", 5106927272042726665L);
        setLongField(term27545, term27545.getClass(), "id", 6913945762720683253L);
        setLongField(term27547, term27547.getClass(), "id", -7873197993099724563L);
        setField(term27547, term27547.getClass(), "extId", term27549);
        setField(term27547, term27547.getClass(), "luid", "olYpqbolWL");
        setIntField(term27564, term27564.getClass(), "year", 2021);
        setShortField(term27564, term27564.getClass(), "month", (short) 4);
        setShortField(term27564, term27564.getClass(), "day", (short) 26);
        setField(term27563, term27563.getClass(), "date", term27564);
        setByteField(term27568, term27568.getClass(), "hour", (byte) 11);
        setByteField(term27568, term27568.getClass(), "minute", (byte) 34);
        setByteField(term27568, term27568.getClass(), "second", (byte) 15);
        setIntField(term27568, term27568.getClass(), "nano", 638206023);
        setField(term27563, term27563.getClass(), "time", term27568);
        setField(term27547, term27547.getClass(), "registerTime", term27563);
        setIntField(term27574, term27574.getClass(), "year", 2013);
        setShortField(term27574, term27574.getClass(), "month", (short) 9);
        setShortField(term27574, term27574.getClass(), "day", (short) 13);
        setField(term27573, term27573.getClass(), "date", term27574);
        setByteField(term27578, term27578.getClass(), "hour", (byte) 14);
        setByteField(term27578, term27578.getClass(), "minute", (byte) 36);
        setByteField(term27578, term27578.getClass(), "second", (byte) 59);
        setIntField(term27578, term27578.getClass(), "nano", 363124001);
        setField(term27573, term27573.getClass(), "time", term27578);
        setField(term27547, term27547.getClass(), "accessTime", term27573);
        setField(term27545, term27545.getClass(), "card", term27547);
        setField(term27545, term27545.getClass(), "userName", "MCMCjxXzjw");
        setIntField(term27545, term27545.getClass(), "isNetMember", -1272714687);
        setIntField(term27545, term27545.getClass(), "iconId", -762778853);
        setIntField(term27545, term27545.getClass(), "plateId", 946727239);
        setIntField(term27545, term27545.getClass(), "titleId", 349182490);
        setIntField(term27545, term27545.getClass(), "partnerId", -353671511);
        setIntField(term27545, term27545.getClass(), "frameId", 1598831363);
        setIntField(term27545, term27545.getClass(), "selectMapId", -690367798);
        setIntField(term27545, term27545.getClass(), "totalAwake", 1863738073);
        setIntField(term27545, term27545.getClass(), "gradeRating", 2009028243);
        setIntField(term27545, term27545.getClass(), "musicRating", 1900131331);
        setIntField(term27545, term27545.getClass(), "playerRating", -1489604464);
        setIntField(term27545, term27545.getClass(), "highestRating", 601642248);
        setIntField(term27545, term27545.getClass(), "gradeRank", -1186936928);
        setIntField(term27545, term27545.getClass(), "classRank", -315380004);
        setIntField(term27545, term27545.getClass(), "courseRank", -1945754843);
        setField(term27545, term27545.getClass(), "charaSlot", term27610);
        setField(term27545, term27545.getClass(), "charaLockSlot", term27616);
        setLongField(term27545, term27545.getClass(), "contentBit", -4539648422466320845L);
        setIntField(term27545, term27545.getClass(), "playCount", -1512221115);
        setField(term27545, term27545.getClass(), "eventWatchedDate", "pZbbwCURge");
        setField(term27545, term27545.getClass(), "lastGameId", "RsOfgdMCMv");
        setField(term27545, term27545.getClass(), "lastRomVersion", "nsofCJqJOR");
        setField(term27545, term27545.getClass(), "lastDataVersion", "CitJiZwsjF");
        setField(term27545, term27545.getClass(), "lastLoginDate", "ZiyMvLArWJ");
        setField(term27545, term27545.getClass(), "lastPlayDate", "MaeokjEfWD");
        setIntField(term27545, term27545.getClass(), "lastPlayCredit", -515486706);
        setIntField(term27545, term27545.getClass(), "lastPlayMode", -612862488);
        setIntField(term27545, term27545.getClass(), "lastPlaceId", 52739905);
        setField(term27545, term27545.getClass(), "lastPlaceName", "ocZcumnXEz");
        setIntField(term27545, term27545.getClass(), "lastAllNetId", -2105349391);
        setIntField(term27545, term27545.getClass(), "lastRegionId", -1176968921);
        setField(term27545, term27545.getClass(), "lastRegionName", "rNNwyactDR");
        setField(term27545, term27545.getClass(), "lastClientId", "QJrTMTdxyh");
        setField(term27545, term27545.getClass(), "lastCountryCode", "rgZSPplPSs");
        setIntField(term27545, term27545.getClass(), "lastSelectEMoney", -1986225025);
        setIntField(term27545, term27545.getClass(), "lastSelectTicket", -838689952);
        setIntField(term27545, term27545.getClass(), "lastSelectCourse", -307464652);
        setIntField(term27545, term27545.getClass(), "lastCountCourse", 460605690);
        setField(term27545, term27545.getClass(), "firstGameId", "NPUSTXlEKx");
        setField(term27545, term27545.getClass(), "firstRomVersion", "KKFprGoNpl");
        setField(term27545, term27545.getClass(), "firstDataVersion", "tWVISJlxKZ");
        setField(term27545, term27545.getClass(), "firstPlayDate", "rOZkUKEoaf");
        setField(term27545, term27545.getClass(), "compatibleCmVersion", "yLnzGqyHGL");
        setField(term27545, term27545.getClass(), "dailyBonusDate", "IjprPXBDuY");
        setField(term27545, term27545.getClass(), "dailyCourseBonusDate", "wkqPmmFDAa");
        setField(term27545, term27545.getClass(), "lastPairLoginDate", "rLTDtNqLyW");
        setField(term27545, term27545.getClass(), "lastTrialPlayDate", "CLsbWobdgS");
        setIntField(term27545, term27545.getClass(), "playVsCount", 2119231643);
        setIntField(term27545, term27545.getClass(), "playSyncCount", 688546450);
        setIntField(term27545, term27545.getClass(), "winCount", 115635779);
        setIntField(term27545, term27545.getClass(), "helpCount", -1081685171);
        setIntField(term27545, term27545.getClass(), "comboCount", 1511699134);
        setLongField(term27545, term27545.getClass(), "totalDeluxscore", 369988508829037253L);
        setLongField(term27545, term27545.getClass(), "totalBasicDeluxscore", -9069994265835848577L);
        setLongField(term27545, term27545.getClass(), "totalAdvancedDeluxscore", -1698215709085558019L);
        setLongField(term27545, term27545.getClass(), "totalExpertDeluxscore", -9057998854977924783L);
        setLongField(term27545, term27545.getClass(), "totalMasterDeluxscore", 8015201292704898322L);
        setLongField(term27545, term27545.getClass(), "totalReMasterDeluxscore", 623115373634781772L);
        setIntField(term27545, term27545.getClass(), "totalSync", 185647247);
        setIntField(term27545, term27545.getClass(), "totalBasicSync", 720814309);
        setIntField(term27545, term27545.getClass(), "totalAdvancedSync", 964137425);
        setIntField(term27545, term27545.getClass(), "totalExpertSync", -1378885614);
        setIntField(term27545, term27545.getClass(), "totalMasterSync", -1408615666);
        setIntField(term27545, term27545.getClass(), "totalReMasterSync", -502299598);
        setLongField(term27545, term27545.getClass(), "totalAchievement", -6928102703492980650L);
        setLongField(term27545, term27545.getClass(), "totalBasicAchievement", -5269076898456067678L);
        setLongField(term27545, term27545.getClass(), "totalAdvancedAchievement", 2124275424075254005L);
        setLongField(term27545, term27545.getClass(), "totalExpertAchievement", -6616339196088014666L);
        setLongField(term27545, term27545.getClass(), "totalMasterAchievement", -1437596366836021966L);
        setLongField(term27545, term27545.getClass(), "totalReMasterAchievement", 8542753860527083778L);
        setLongField(term27545, term27545.getClass(), "playerOldRating", -7981877752051488010L);
        setLongField(term27545, term27545.getClass(), "playerNewRating", 4486175312218543930L);
        setIntField(term27545, term27545.getClass(), "banState", -516287593);
        setLongField(term27545, term27545.getClass(), "dateTime", -5866516262253090421L);
        setField(term27543, term27543.getClass(), "user", term27545);
        setIntField(term27543, term27543.getClass(), "seasonId", -187311406);
        setIntField(term27543, term27543.getClass(), "point", 1496632406);
        setIntField(term27543, term27543.getClass(), "rank", 1858277277);
        setBooleanField(term27543, term27543.getClass(), "rewardGet", true);
        setField(term27543, term27543.getClass(), "userName", "TbYrjEyFPc");
        setField(term27543, term27543.getClass(), "recordDate", "muefchpJiZ");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserFriendSeasonRanking");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term27543, args);
    }

};


