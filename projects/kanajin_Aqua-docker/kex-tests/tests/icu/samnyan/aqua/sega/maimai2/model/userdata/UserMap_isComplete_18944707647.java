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

public class UserMap_isComplete_18944707647 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term577242;

    public UserMap_isComplete_18944707647() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term577248 = new Long(8018453258973130416L);
        Integer term577311 = new Integer(-501735949);
        Integer term577313 = new Integer(1633315544);
        Integer term577315 = new Integer(1699846026);
        Integer term577317 = new Integer(-1144234812);
        Integer term577319 = new Integer(-2144123201);
        Integer term577321 = new Integer(1436840858);
        ArrayList term577309 = new ArrayList();
        ((ArrayList) term577309).add(term577311);
        ((ArrayList) term577309).add(term577313);
        ((ArrayList) term577309).add(term577315);
        ((ArrayList) term577309).add(term577317);
        ((ArrayList) term577309).add(term577319);
        ((ArrayList) term577309).add(term577321);
        Integer term577327 = new Integer(-2146939628);
        Integer term577329 = new Integer(-1735999292);
        Integer term577331 = new Integer(1978300005);
        ArrayList term577325 = new ArrayList();
        ((ArrayList) term577325).add(term577327);
        ((ArrayList) term577325).add(term577329);
        ((ArrayList) term577325).add(term577331);
        term577242 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserMap"));
        Object term577244 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term577246 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term577262 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term577263 = newInstance(Class.forName("java.time.LocalDate"));
        Object term577267 = newInstance(Class.forName("java.time.LocalTime"));
        Object term577272 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term577273 = newInstance(Class.forName("java.time.LocalDate"));
        Object term577277 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term577242, term577242.getClass(), "id", 1584227134146357106L);
        setLongField(term577244, term577244.getClass(), "id", 7631968558361200196L);
        setLongField(term577246, term577246.getClass(), "id", 859061352835045743L);
        setField(term577246, term577246.getClass(), "extId", term577248);
        setField(term577246, term577246.getClass(), "luid", "CVjvHGyMJc");
        setIntField(term577263, term577263.getClass(), "year", 2029);
        setShortField(term577263, term577263.getClass(), "month", (short) 5);
        setShortField(term577263, term577263.getClass(), "day", (short) 20);
        setField(term577262, term577262.getClass(), "date", term577263);
        setByteField(term577267, term577267.getClass(), "hour", (byte) 9);
        setByteField(term577267, term577267.getClass(), "minute", (byte) 6);
        setByteField(term577267, term577267.getClass(), "second", (byte) 24);
        setIntField(term577267, term577267.getClass(), "nano", 547586328);
        setField(term577262, term577262.getClass(), "time", term577267);
        setField(term577246, term577246.getClass(), "registerTime", term577262);
        setIntField(term577273, term577273.getClass(), "year", 2025);
        setShortField(term577273, term577273.getClass(), "month", (short) 8);
        setShortField(term577273, term577273.getClass(), "day", (short) 6);
        setField(term577272, term577272.getClass(), "date", term577273);
        setByteField(term577277, term577277.getClass(), "hour", (byte) 4);
        setByteField(term577277, term577277.getClass(), "minute", (byte) 5);
        setByteField(term577277, term577277.getClass(), "second", (byte) 8);
        setIntField(term577277, term577277.getClass(), "nano", 886071095);
        setField(term577272, term577272.getClass(), "time", term577277);
        setField(term577246, term577246.getClass(), "accessTime", term577272);
        setField(term577244, term577244.getClass(), "card", term577246);
        setField(term577244, term577244.getClass(), "userName", "xpEnIwgEHD");
        setIntField(term577244, term577244.getClass(), "isNetMember", 1356804831);
        setIntField(term577244, term577244.getClass(), "iconId", -1279971762);
        setIntField(term577244, term577244.getClass(), "plateId", 747807712);
        setIntField(term577244, term577244.getClass(), "titleId", -1782404245);
        setIntField(term577244, term577244.getClass(), "partnerId", -1127297665);
        setIntField(term577244, term577244.getClass(), "frameId", 931443934);
        setIntField(term577244, term577244.getClass(), "selectMapId", 787128515);
        setIntField(term577244, term577244.getClass(), "totalAwake", -324250338);
        setIntField(term577244, term577244.getClass(), "gradeRating", 132186278);
        setIntField(term577244, term577244.getClass(), "musicRating", -872054213);
        setIntField(term577244, term577244.getClass(), "playerRating", 22931909);
        setIntField(term577244, term577244.getClass(), "highestRating", -882628829);
        setIntField(term577244, term577244.getClass(), "gradeRank", 712825177);
        setIntField(term577244, term577244.getClass(), "classRank", 521529324);
        setIntField(term577244, term577244.getClass(), "courseRank", 1402111529);
        setField(term577244, term577244.getClass(), "charaSlot", term577309);
        setField(term577244, term577244.getClass(), "charaLockSlot", term577325);
        setLongField(term577244, term577244.getClass(), "contentBit", 9073369164143900301L);
        setIntField(term577244, term577244.getClass(), "playCount", -1418571723);
        setField(term577244, term577244.getClass(), "eventWatchedDate", "bBATgsPQRr");
        setField(term577244, term577244.getClass(), "lastGameId", "mNKvvYjyTb");
        setField(term577244, term577244.getClass(), "lastRomVersion", "MstSbCMhXj");
        setField(term577244, term577244.getClass(), "lastDataVersion", "qTEXCoslYM");
        setField(term577244, term577244.getClass(), "lastLoginDate", "pBhpUTWvGA");
        setField(term577244, term577244.getClass(), "lastPlayDate", "HhhOFrEkrm");
        setIntField(term577244, term577244.getClass(), "lastPlayCredit", -122720363);
        setIntField(term577244, term577244.getClass(), "lastPlayMode", 359256855);
        setIntField(term577244, term577244.getClass(), "lastPlaceId", -953239059);
        setField(term577244, term577244.getClass(), "lastPlaceName", "tAubLJYbsO");
        setIntField(term577244, term577244.getClass(), "lastAllNetId", -450357690);
        setIntField(term577244, term577244.getClass(), "lastRegionId", -97119065);
        setField(term577244, term577244.getClass(), "lastRegionName", "pezsZIPwlh");
        setField(term577244, term577244.getClass(), "lastClientId", "eYURdraHtB");
        setField(term577244, term577244.getClass(), "lastCountryCode", "iXedAHwACn");
        setIntField(term577244, term577244.getClass(), "lastSelectEMoney", 2045771335);
        setIntField(term577244, term577244.getClass(), "lastSelectTicket", 1632980542);
        setIntField(term577244, term577244.getClass(), "lastSelectCourse", 227731435);
        setIntField(term577244, term577244.getClass(), "lastCountCourse", -1932750150);
        setField(term577244, term577244.getClass(), "firstGameId", "sXbOdUjZge");
        setField(term577244, term577244.getClass(), "firstRomVersion", "XyRhIdTuEv");
        setField(term577244, term577244.getClass(), "firstDataVersion", "cdzgvykBHS");
        setField(term577244, term577244.getClass(), "firstPlayDate", "dIxdFDlAxH");
        setField(term577244, term577244.getClass(), "compatibleCmVersion", "WZGhEhKwsb");
        setField(term577244, term577244.getClass(), "dailyBonusDate", "SOznTiXpmD");
        setField(term577244, term577244.getClass(), "dailyCourseBonusDate", "DrfaOPJBAu");
        setField(term577244, term577244.getClass(), "lastPairLoginDate", "hERqouXquS");
        setField(term577244, term577244.getClass(), "lastTrialPlayDate", "rftFLoLfHM");
        setIntField(term577244, term577244.getClass(), "playVsCount", -625869969);
        setIntField(term577244, term577244.getClass(), "playSyncCount", -1833341650);
        setIntField(term577244, term577244.getClass(), "winCount", -532373514);
        setIntField(term577244, term577244.getClass(), "helpCount", -295218767);
        setIntField(term577244, term577244.getClass(), "comboCount", -333686225);
        setLongField(term577244, term577244.getClass(), "totalDeluxscore", 2701421449096097417L);
        setLongField(term577244, term577244.getClass(), "totalBasicDeluxscore", 834176143513586556L);
        setLongField(term577244, term577244.getClass(), "totalAdvancedDeluxscore", -2464407837813270318L);
        setLongField(term577244, term577244.getClass(), "totalExpertDeluxscore", 2427428992348290406L);
        setLongField(term577244, term577244.getClass(), "totalMasterDeluxscore", 5660835718552968047L);
        setLongField(term577244, term577244.getClass(), "totalReMasterDeluxscore", 1173231071572512883L);
        setIntField(term577244, term577244.getClass(), "totalSync", -1905785692);
        setIntField(term577244, term577244.getClass(), "totalBasicSync", -219553948);
        setIntField(term577244, term577244.getClass(), "totalAdvancedSync", 1596618039);
        setIntField(term577244, term577244.getClass(), "totalExpertSync", 380399189);
        setIntField(term577244, term577244.getClass(), "totalMasterSync", 919594131);
        setIntField(term577244, term577244.getClass(), "totalReMasterSync", -590241415);
        setLongField(term577244, term577244.getClass(), "totalAchievement", 5537222097181253536L);
        setLongField(term577244, term577244.getClass(), "totalBasicAchievement", 7309028491629959993L);
        setLongField(term577244, term577244.getClass(), "totalAdvancedAchievement", -4328601101597960707L);
        setLongField(term577244, term577244.getClass(), "totalExpertAchievement", 1074709193356465063L);
        setLongField(term577244, term577244.getClass(), "totalMasterAchievement", 7204386601566496769L);
        setLongField(term577244, term577244.getClass(), "totalReMasterAchievement", -2266064789184690652L);
        setLongField(term577244, term577244.getClass(), "playerOldRating", -4156637207343989300L);
        setLongField(term577244, term577244.getClass(), "playerNewRating", -1734841124953761033L);
        setIntField(term577244, term577244.getClass(), "banState", -1905506285);
        setLongField(term577244, term577244.getClass(), "dateTime", -114095039832335324L);
        setField(term577242, term577242.getClass(), "user", term577244);
        setIntField(term577242, term577242.getClass(), "mapId", -690652507);
        setIntField(term577242, term577242.getClass(), "distance", 997264493);
        setBooleanField(term577242, term577242.getClass(), "isLock", false);
        setBooleanField(term577242, term577242.getClass(), "isClear", false);
        setBooleanField(term577242, term577242.getClass(), "isComplete", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserMap");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isComplete", argTypes, term577242, args);
    }

};


