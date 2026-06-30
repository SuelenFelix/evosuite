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

public class UserMap_setMapId_21687889210 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term579565;
     Object term579933;

    public UserMap_setMapId_21687889210() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term579571 = new Long(6558561920118298074L);
        Integer term579634 = new Integer(1854068400);
        Integer term579636 = new Integer(-2058269574);
        ArrayList term579632 = new ArrayList();
        ((ArrayList) term579632).add(term579634);
        ((ArrayList) term579632).add(term579636);
        Integer term579642 = new Integer(1108197466);
        Integer term579644 = new Integer(-2027597725);
        Integer term579646 = new Integer(-1205843165);
        Integer term579648 = new Integer(-163945873);
        Integer term579650 = new Integer(23998582);
        Integer term579652 = new Integer(1341914996);
        Integer term579654 = new Integer(1542038802);
        Integer term579656 = new Integer(-1984766098);
        Integer term579658 = new Integer(1561867809);
        ArrayList term579640 = new ArrayList();
        ((ArrayList) term579640).add(term579642);
        ((ArrayList) term579640).add(term579644);
        ((ArrayList) term579640).add(term579646);
        ((ArrayList) term579640).add(term579648);
        ((ArrayList) term579640).add(term579650);
        ((ArrayList) term579640).add(term579652);
        ((ArrayList) term579640).add(term579654);
        ((ArrayList) term579640).add(term579656);
        ((ArrayList) term579640).add(term579658);
        term579565 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserMap"));
        Object term579567 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term579569 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term579585 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term579586 = newInstance(Class.forName("java.time.LocalDate"));
        Object term579590 = newInstance(Class.forName("java.time.LocalTime"));
        Object term579595 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term579596 = newInstance(Class.forName("java.time.LocalDate"));
        Object term579600 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term579565, term579565.getClass(), "id", 9009807566204188350L);
        setLongField(term579567, term579567.getClass(), "id", -5015276552105623905L);
        setLongField(term579569, term579569.getClass(), "id", 3077342935956580953L);
        setField(term579569, term579569.getClass(), "extId", term579571);
        setField(term579569, term579569.getClass(), "luid", "QaSHZEgbER");
        setIntField(term579586, term579586.getClass(), "year", 2019);
        setShortField(term579586, term579586.getClass(), "month", (short) 3);
        setShortField(term579586, term579586.getClass(), "day", (short) 27);
        setField(term579585, term579585.getClass(), "date", term579586);
        setByteField(term579590, term579590.getClass(), "hour", (byte) 10);
        setByteField(term579590, term579590.getClass(), "minute", (byte) 13);
        setByteField(term579590, term579590.getClass(), "second", (byte) 46);
        setIntField(term579590, term579590.getClass(), "nano", 425017391);
        setField(term579585, term579585.getClass(), "time", term579590);
        setField(term579569, term579569.getClass(), "registerTime", term579585);
        setIntField(term579596, term579596.getClass(), "year", 2026);
        setShortField(term579596, term579596.getClass(), "month", (short) 5);
        setShortField(term579596, term579596.getClass(), "day", (short) 13);
        setField(term579595, term579595.getClass(), "date", term579596);
        setByteField(term579600, term579600.getClass(), "hour", (byte) 7);
        setByteField(term579600, term579600.getClass(), "minute", (byte) 33);
        setByteField(term579600, term579600.getClass(), "second", (byte) 4);
        setIntField(term579600, term579600.getClass(), "nano", 912546150);
        setField(term579595, term579595.getClass(), "time", term579600);
        setField(term579569, term579569.getClass(), "accessTime", term579595);
        setField(term579567, term579567.getClass(), "card", term579569);
        setField(term579567, term579567.getClass(), "userName", "erZpLkPhGw");
        setIntField(term579567, term579567.getClass(), "isNetMember", 1292547090);
        setIntField(term579567, term579567.getClass(), "iconId", -829963856);
        setIntField(term579567, term579567.getClass(), "plateId", 752630869);
        setIntField(term579567, term579567.getClass(), "titleId", 652321246);
        setIntField(term579567, term579567.getClass(), "partnerId", 2076842956);
        setIntField(term579567, term579567.getClass(), "frameId", -1678259693);
        setIntField(term579567, term579567.getClass(), "selectMapId", 1029076319);
        setIntField(term579567, term579567.getClass(), "totalAwake", 2147136724);
        setIntField(term579567, term579567.getClass(), "gradeRating", -135791847);
        setIntField(term579567, term579567.getClass(), "musicRating", -155241882);
        setIntField(term579567, term579567.getClass(), "playerRating", -1344882529);
        setIntField(term579567, term579567.getClass(), "highestRating", -485468239);
        setIntField(term579567, term579567.getClass(), "gradeRank", -1312810859);
        setIntField(term579567, term579567.getClass(), "classRank", -178569564);
        setIntField(term579567, term579567.getClass(), "courseRank", 1128203253);
        setField(term579567, term579567.getClass(), "charaSlot", term579632);
        setField(term579567, term579567.getClass(), "charaLockSlot", term579640);
        setLongField(term579567, term579567.getClass(), "contentBit", 6806287023346144912L);
        setIntField(term579567, term579567.getClass(), "playCount", 784383610);
        setField(term579567, term579567.getClass(), "eventWatchedDate", "zFEiIQxACU");
        setField(term579567, term579567.getClass(), "lastGameId", "luxKjoEfqN");
        setField(term579567, term579567.getClass(), "lastRomVersion", "fREErNRcJp");
        setField(term579567, term579567.getClass(), "lastDataVersion", "QJLEpLOZLB");
        setField(term579567, term579567.getClass(), "lastLoginDate", "XhFHBHoUou");
        setField(term579567, term579567.getClass(), "lastPlayDate", "vzeQsGAKvi");
        setIntField(term579567, term579567.getClass(), "lastPlayCredit", 412476813);
        setIntField(term579567, term579567.getClass(), "lastPlayMode", -385291109);
        setIntField(term579567, term579567.getClass(), "lastPlaceId", -598124215);
        setField(term579567, term579567.getClass(), "lastPlaceName", "kJxulDbOur");
        setIntField(term579567, term579567.getClass(), "lastAllNetId", 1533512430);
        setIntField(term579567, term579567.getClass(), "lastRegionId", 1794551286);
        setField(term579567, term579567.getClass(), "lastRegionName", "FBkrSyfzWU");
        setField(term579567, term579567.getClass(), "lastClientId", "lLkFwOFRiz");
        setField(term579567, term579567.getClass(), "lastCountryCode", "ZNLidWynbc");
        setIntField(term579567, term579567.getClass(), "lastSelectEMoney", -1684498738);
        setIntField(term579567, term579567.getClass(), "lastSelectTicket", -545459813);
        setIntField(term579567, term579567.getClass(), "lastSelectCourse", -2134342643);
        setIntField(term579567, term579567.getClass(), "lastCountCourse", 653939616);
        setField(term579567, term579567.getClass(), "firstGameId", "zqPjBrmBkS");
        setField(term579567, term579567.getClass(), "firstRomVersion", "BgXDXjCfkI");
        setField(term579567, term579567.getClass(), "firstDataVersion", "XTwIGPgvRA");
        setField(term579567, term579567.getClass(), "firstPlayDate", "XsqDQISIoz");
        setField(term579567, term579567.getClass(), "compatibleCmVersion", "DCwzmWuhqc");
        setField(term579567, term579567.getClass(), "dailyBonusDate", "NgRLydCERh");
        setField(term579567, term579567.getClass(), "dailyCourseBonusDate", "oZNRqFlbqo");
        setField(term579567, term579567.getClass(), "lastPairLoginDate", "EvBZIlGnHL");
        setField(term579567, term579567.getClass(), "lastTrialPlayDate", "rAHohXhPiG");
        setIntField(term579567, term579567.getClass(), "playVsCount", -283221603);
        setIntField(term579567, term579567.getClass(), "playSyncCount", -2048193192);
        setIntField(term579567, term579567.getClass(), "winCount", 1999618525);
        setIntField(term579567, term579567.getClass(), "helpCount", -587724629);
        setIntField(term579567, term579567.getClass(), "comboCount", 1868158627);
        setLongField(term579567, term579567.getClass(), "totalDeluxscore", 1471501168594690006L);
        setLongField(term579567, term579567.getClass(), "totalBasicDeluxscore", 4749769175987447687L);
        setLongField(term579567, term579567.getClass(), "totalAdvancedDeluxscore", -6304217350470610619L);
        setLongField(term579567, term579567.getClass(), "totalExpertDeluxscore", -5453254120470554667L);
        setLongField(term579567, term579567.getClass(), "totalMasterDeluxscore", 6820607519357852706L);
        setLongField(term579567, term579567.getClass(), "totalReMasterDeluxscore", -6011105197941993551L);
        setIntField(term579567, term579567.getClass(), "totalSync", -726141456);
        setIntField(term579567, term579567.getClass(), "totalBasicSync", 478302571);
        setIntField(term579567, term579567.getClass(), "totalAdvancedSync", 916962617);
        setIntField(term579567, term579567.getClass(), "totalExpertSync", -1653517729);
        setIntField(term579567, term579567.getClass(), "totalMasterSync", -1958083420);
        setIntField(term579567, term579567.getClass(), "totalReMasterSync", 602313999);
        setLongField(term579567, term579567.getClass(), "totalAchievement", -3262665771842116650L);
        setLongField(term579567, term579567.getClass(), "totalBasicAchievement", 1871887191350577500L);
        setLongField(term579567, term579567.getClass(), "totalAdvancedAchievement", 8914449831696980099L);
        setLongField(term579567, term579567.getClass(), "totalExpertAchievement", 2563297309515562886L);
        setLongField(term579567, term579567.getClass(), "totalMasterAchievement", -5460661494229981696L);
        setLongField(term579567, term579567.getClass(), "totalReMasterAchievement", 8277360752233487856L);
        setLongField(term579567, term579567.getClass(), "playerOldRating", 8967373620208520994L);
        setLongField(term579567, term579567.getClass(), "playerNewRating", 6988227896855238737L);
        setIntField(term579567, term579567.getClass(), "banState", 1593848933);
        setLongField(term579567, term579567.getClass(), "dateTime", -8240829198376044227L);
        setField(term579565, term579565.getClass(), "user", term579567);
        setIntField(term579565, term579565.getClass(), "mapId", -1723586539);
        setIntField(term579565, term579565.getClass(), "distance", -708722012);
        setBooleanField(term579565, term579565.getClass(), "isLock", true);
        setBooleanField(term579565, term579565.getClass(), "isClear", true);
        setBooleanField(term579565, term579565.getClass(), "isComplete", true);
        term579933 = new Integer(-2091129612);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserMap");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term579933;
        callMethod(klass, "setMapId", argTypes, term579565, args);
    }

};


