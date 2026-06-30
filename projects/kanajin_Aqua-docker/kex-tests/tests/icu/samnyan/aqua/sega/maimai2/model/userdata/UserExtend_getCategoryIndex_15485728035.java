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

public class UserExtend_getCategoryIndex_15485728035 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term144355;

    public UserExtend_getCategoryIndex_15485728035() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term144361 = new Long(8107921244631636572L);
        ArrayList term144422 = new ArrayList();
        Integer term144428 = new Integer(-156316508);
        Integer term144430 = new Integer(-1304449497);
        Integer term144432 = new Integer(-80320412);
        Integer term144434 = new Integer(-356797136);
        ArrayList term144426 = new ArrayList();
        ((ArrayList) term144426).add(term144428);
        ((ArrayList) term144426).add(term144430);
        ((ArrayList) term144426).add(term144432);
        ((ArrayList) term144426).add(term144434);
        Integer term144718 = new Integer(-2035641970);
        Integer term144720 = new Integer(1813581230);
        Integer term144722 = new Integer(844569461);
        Integer term144724 = new Integer(-15085966);
        Integer term144726 = new Integer(-1929631412);
        Integer term144728 = new Integer(1014160441);
        Integer term144730 = new Integer(975753484);
        Integer term144732 = new Integer(-1886360357);
        Integer term144734 = new Integer(-235867268);
        ArrayList term144716 = new ArrayList();
        ((ArrayList) term144716).add(term144718);
        ((ArrayList) term144716).add(term144720);
        ((ArrayList) term144716).add(term144722);
        ((ArrayList) term144716).add(term144724);
        ((ArrayList) term144716).add(term144726);
        ((ArrayList) term144716).add(term144728);
        ((ArrayList) term144716).add(term144730);
        ((ArrayList) term144716).add(term144732);
        ((ArrayList) term144716).add(term144734);
        ArrayList term144738 = new ArrayList();
        term144355 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserExtend"));
        Object term144357 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term144359 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term144375 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term144376 = newInstance(Class.forName("java.time.LocalDate"));
        Object term144380 = newInstance(Class.forName("java.time.LocalTime"));
        Object term144385 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term144386 = newInstance(Class.forName("java.time.LocalDate"));
        Object term144390 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term144355, term144355.getClass(), "id", -2213600428279271018L);
        setLongField(term144357, term144357.getClass(), "id", 626353265438400302L);
        setLongField(term144359, term144359.getClass(), "id", 5906403446691111195L);
        setField(term144359, term144359.getClass(), "extId", term144361);
        setField(term144359, term144359.getClass(), "luid", "PVYBCybavV");
        setIntField(term144376, term144376.getClass(), "year", 2023);
        setShortField(term144376, term144376.getClass(), "month", (short) 1);
        setShortField(term144376, term144376.getClass(), "day", (short) 10);
        setField(term144375, term144375.getClass(), "date", term144376);
        setByteField(term144380, term144380.getClass(), "hour", (byte) 2);
        setByteField(term144380, term144380.getClass(), "minute", (byte) 12);
        setByteField(term144380, term144380.getClass(), "second", (byte) 45);
        setIntField(term144380, term144380.getClass(), "nano", 793047168);
        setField(term144375, term144375.getClass(), "time", term144380);
        setField(term144359, term144359.getClass(), "registerTime", term144375);
        setIntField(term144386, term144386.getClass(), "year", 2028);
        setShortField(term144386, term144386.getClass(), "month", (short) 6);
        setShortField(term144386, term144386.getClass(), "day", (short) 12);
        setField(term144385, term144385.getClass(), "date", term144386);
        setByteField(term144390, term144390.getClass(), "hour", (byte) 9);
        setByteField(term144390, term144390.getClass(), "minute", (byte) 39);
        setByteField(term144390, term144390.getClass(), "second", (byte) 7);
        setIntField(term144390, term144390.getClass(), "nano", 950068890);
        setField(term144385, term144385.getClass(), "time", term144390);
        setField(term144359, term144359.getClass(), "accessTime", term144385);
        setField(term144357, term144357.getClass(), "card", term144359);
        setField(term144357, term144357.getClass(), "userName", "lXOLVBrGzc");
        setIntField(term144357, term144357.getClass(), "isNetMember", -2024603739);
        setIntField(term144357, term144357.getClass(), "iconId", -501282440);
        setIntField(term144357, term144357.getClass(), "plateId", 890596068);
        setIntField(term144357, term144357.getClass(), "titleId", -917816022);
        setIntField(term144357, term144357.getClass(), "partnerId", 629691796);
        setIntField(term144357, term144357.getClass(), "frameId", -977560951);
        setIntField(term144357, term144357.getClass(), "selectMapId", 934860256);
        setIntField(term144357, term144357.getClass(), "totalAwake", 956376778);
        setIntField(term144357, term144357.getClass(), "gradeRating", 1455387853);
        setIntField(term144357, term144357.getClass(), "musicRating", -991820426);
        setIntField(term144357, term144357.getClass(), "playerRating", 1097512745);
        setIntField(term144357, term144357.getClass(), "highestRating", 449748254);
        setIntField(term144357, term144357.getClass(), "gradeRank", 446092014);
        setIntField(term144357, term144357.getClass(), "classRank", 1299747957);
        setIntField(term144357, term144357.getClass(), "courseRank", 1495850839);
        setField(term144357, term144357.getClass(), "charaSlot", term144422);
        setField(term144357, term144357.getClass(), "charaLockSlot", term144426);
        setLongField(term144357, term144357.getClass(), "contentBit", -2545711420820127794L);
        setIntField(term144357, term144357.getClass(), "playCount", -803230600);
        setField(term144357, term144357.getClass(), "eventWatchedDate", "lWRWhoPZaY");
        setField(term144357, term144357.getClass(), "lastGameId", "jUBVwhASOA");
        setField(term144357, term144357.getClass(), "lastRomVersion", "WNLNmPMYIn");
        setField(term144357, term144357.getClass(), "lastDataVersion", "uGYzQjwRvb");
        setField(term144357, term144357.getClass(), "lastLoginDate", "nkZCVHXnmb");
        setField(term144357, term144357.getClass(), "lastPlayDate", "eevshnfTuP");
        setIntField(term144357, term144357.getClass(), "lastPlayCredit", -1664980170);
        setIntField(term144357, term144357.getClass(), "lastPlayMode", -1434914663);
        setIntField(term144357, term144357.getClass(), "lastPlaceId", -1057659831);
        setField(term144357, term144357.getClass(), "lastPlaceName", "HzOxmBbucP");
        setIntField(term144357, term144357.getClass(), "lastAllNetId", -1734417411);
        setIntField(term144357, term144357.getClass(), "lastRegionId", 2082696095);
        setField(term144357, term144357.getClass(), "lastRegionName", "lVuUoDaGSk");
        setField(term144357, term144357.getClass(), "lastClientId", "cuNrapAQtZ");
        setField(term144357, term144357.getClass(), "lastCountryCode", "fCiCxxhDyR");
        setIntField(term144357, term144357.getClass(), "lastSelectEMoney", 1962199891);
        setIntField(term144357, term144357.getClass(), "lastSelectTicket", 47146584);
        setIntField(term144357, term144357.getClass(), "lastSelectCourse", 2101216461);
        setIntField(term144357, term144357.getClass(), "lastCountCourse", 1476730674);
        setField(term144357, term144357.getClass(), "firstGameId", "AseuIhxdgC");
        setField(term144357, term144357.getClass(), "firstRomVersion", "JXKflOoAwA");
        setField(term144357, term144357.getClass(), "firstDataVersion", "sqUthQtpCU");
        setField(term144357, term144357.getClass(), "firstPlayDate", "heMCJQtnSe");
        setField(term144357, term144357.getClass(), "compatibleCmVersion", "nozhcagtoi");
        setField(term144357, term144357.getClass(), "dailyBonusDate", "UAotjofyqR");
        setField(term144357, term144357.getClass(), "dailyCourseBonusDate", "ZVxspVELsB");
        setField(term144357, term144357.getClass(), "lastPairLoginDate", "lwBTtSWyCb");
        setField(term144357, term144357.getClass(), "lastTrialPlayDate", "jalAJUuHgn");
        setIntField(term144357, term144357.getClass(), "playVsCount", 1325210683);
        setIntField(term144357, term144357.getClass(), "playSyncCount", 794195150);
        setIntField(term144357, term144357.getClass(), "winCount", -84410522);
        setIntField(term144357, term144357.getClass(), "helpCount", 512600470);
        setIntField(term144357, term144357.getClass(), "comboCount", -694618352);
        setLongField(term144357, term144357.getClass(), "totalDeluxscore", -9095378486001039156L);
        setLongField(term144357, term144357.getClass(), "totalBasicDeluxscore", -4363412272132313401L);
        setLongField(term144357, term144357.getClass(), "totalAdvancedDeluxscore", 184995883378761613L);
        setLongField(term144357, term144357.getClass(), "totalExpertDeluxscore", -1961336317298398723L);
        setLongField(term144357, term144357.getClass(), "totalMasterDeluxscore", -4188014368193495459L);
        setLongField(term144357, term144357.getClass(), "totalReMasterDeluxscore", -6162042744608645687L);
        setIntField(term144357, term144357.getClass(), "totalSync", -656718439);
        setIntField(term144357, term144357.getClass(), "totalBasicSync", 1609229129);
        setIntField(term144357, term144357.getClass(), "totalAdvancedSync", 558262249);
        setIntField(term144357, term144357.getClass(), "totalExpertSync", 105201149);
        setIntField(term144357, term144357.getClass(), "totalMasterSync", 848802875);
        setIntField(term144357, term144357.getClass(), "totalReMasterSync", 103720158);
        setLongField(term144357, term144357.getClass(), "totalAchievement", -768181341123198570L);
        setLongField(term144357, term144357.getClass(), "totalBasicAchievement", 2215962843194405336L);
        setLongField(term144357, term144357.getClass(), "totalAdvancedAchievement", 7879219871162071666L);
        setLongField(term144357, term144357.getClass(), "totalExpertAchievement", 1261850776639815763L);
        setLongField(term144357, term144357.getClass(), "totalMasterAchievement", -685097663307483951L);
        setLongField(term144357, term144357.getClass(), "totalReMasterAchievement", -4168405689932850368L);
        setLongField(term144357, term144357.getClass(), "playerOldRating", 1994467307553019192L);
        setLongField(term144357, term144357.getClass(), "playerNewRating", 6166211929948701735L);
        setIntField(term144357, term144357.getClass(), "banState", 1049168594);
        setLongField(term144357, term144357.getClass(), "dateTime", 5420405057636586268L);
        setField(term144355, term144355.getClass(), "user", term144357);
        setIntField(term144355, term144355.getClass(), "selectMusicId", 1078375453);
        setIntField(term144355, term144355.getClass(), "selectDifficultyId", 687029252);
        setIntField(term144355, term144355.getClass(), "categoryIndex", -289940076);
        setIntField(term144355, term144355.getClass(), "musicIndex", -438583850);
        setIntField(term144355, term144355.getClass(), "extraFlag", 246166593);
        setIntField(term144355, term144355.getClass(), "selectScoreType", -1806147197);
        setLongField(term144355, term144355.getClass(), "extendContentBit", -5193308217272845832L);
        setBooleanField(term144355, term144355.getClass(), "isPhotoAgree", false);
        setBooleanField(term144355, term144355.getClass(), "isGotoCodeRead", false);
        setBooleanField(term144355, term144355.getClass(), "selectResultDetails", false);
        setIntField(term144355, term144355.getClass(), "sortCategorySetting", -236721588);
        setIntField(term144355, term144355.getClass(), "sortMusicSetting", 1662513131);
        setField(term144355, term144355.getClass(), "selectedCardList", term144716);
        setField(term144355, term144355.getClass(), "encountMapNpcList", term144738);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserExtend");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getCategoryIndex", argTypes, term144355, args);
    }

};


