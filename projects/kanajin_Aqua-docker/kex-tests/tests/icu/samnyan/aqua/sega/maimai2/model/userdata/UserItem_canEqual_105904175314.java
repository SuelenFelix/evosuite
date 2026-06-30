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

public class UserItem_canEqual_105904175314 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term41497;
     Object term41848;

    public UserItem_canEqual_105904175314() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term41503 = new Long(-1610676979013636850L);
        Integer term41566 = new Integer(1427305953);
        ArrayList term41564 = new ArrayList();
        ((ArrayList) term41564).add(term41566);
        Integer term41572 = new Integer(-781832877);
        Integer term41574 = new Integer(797203987);
        ArrayList term41570 = new ArrayList();
        ((ArrayList) term41570).add(term41572);
        ((ArrayList) term41570).add(term41574);
        term41497 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserItem"));
        Object term41499 = newInstance(Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserDetail"));
        Object term41501 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term41517 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term41518 = newInstance(Class.forName("java.time.LocalDate"));
        Object term41522 = newInstance(Class.forName("java.time.LocalTime"));
        Object term41527 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term41528 = newInstance(Class.forName("java.time.LocalDate"));
        Object term41532 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term41497, term41497.getClass(), "id", 6187687406539061577L);
        setLongField(term41499, term41499.getClass(), "id", -4281700567835283963L);
        setLongField(term41501, term41501.getClass(), "id", 8779425347424216281L);
        setField(term41501, term41501.getClass(), "extId", term41503);
        setField(term41501, term41501.getClass(), "luid", "mmpgARMYFV");
        setIntField(term41518, term41518.getClass(), "year", 2017);
        setShortField(term41518, term41518.getClass(), "month", (short) 6);
        setShortField(term41518, term41518.getClass(), "day", (short) 28);
        setField(term41517, term41517.getClass(), "date", term41518);
        setByteField(term41522, term41522.getClass(), "hour", (byte) 8);
        setByteField(term41522, term41522.getClass(), "minute", (byte) 1);
        setByteField(term41522, term41522.getClass(), "second", (byte) 14);
        setIntField(term41522, term41522.getClass(), "nano", 501033715);
        setField(term41517, term41517.getClass(), "time", term41522);
        setField(term41501, term41501.getClass(), "registerTime", term41517);
        setIntField(term41528, term41528.getClass(), "year", 2016);
        setShortField(term41528, term41528.getClass(), "month", (short) 10);
        setShortField(term41528, term41528.getClass(), "day", (short) 10);
        setField(term41527, term41527.getClass(), "date", term41528);
        setByteField(term41532, term41532.getClass(), "hour", (byte) 16);
        setByteField(term41532, term41532.getClass(), "minute", (byte) 7);
        setByteField(term41532, term41532.getClass(), "second", (byte) 16);
        setIntField(term41532, term41532.getClass(), "nano", 995200309);
        setField(term41527, term41527.getClass(), "time", term41532);
        setField(term41501, term41501.getClass(), "accessTime", term41527);
        setField(term41499, term41499.getClass(), "card", term41501);
        setField(term41499, term41499.getClass(), "userName", "NUqhsZprdZ");
        setIntField(term41499, term41499.getClass(), "isNetMember", 506784803);
        setIntField(term41499, term41499.getClass(), "iconId", -1201816382);
        setIntField(term41499, term41499.getClass(), "plateId", 964841377);
        setIntField(term41499, term41499.getClass(), "titleId", -1503153618);
        setIntField(term41499, term41499.getClass(), "partnerId", -1417720854);
        setIntField(term41499, term41499.getClass(), "frameId", -231019352);
        setIntField(term41499, term41499.getClass(), "selectMapId", -677712787);
        setIntField(term41499, term41499.getClass(), "totalAwake", -473854701);
        setIntField(term41499, term41499.getClass(), "gradeRating", -193355905);
        setIntField(term41499, term41499.getClass(), "musicRating", -104223978);
        setIntField(term41499, term41499.getClass(), "playerRating", 192932780);
        setIntField(term41499, term41499.getClass(), "highestRating", -902517932);
        setIntField(term41499, term41499.getClass(), "gradeRank", 2043141938);
        setIntField(term41499, term41499.getClass(), "classRank", 51110531);
        setIntField(term41499, term41499.getClass(), "courseRank", -142424158);
        setField(term41499, term41499.getClass(), "charaSlot", term41564);
        setField(term41499, term41499.getClass(), "charaLockSlot", term41570);
        setLongField(term41499, term41499.getClass(), "contentBit", 3878526639209086211L);
        setIntField(term41499, term41499.getClass(), "playCount", 360866091);
        setField(term41499, term41499.getClass(), "eventWatchedDate", "jkzgCqWJrA");
        setField(term41499, term41499.getClass(), "lastGameId", "rawiXxuyRn");
        setField(term41499, term41499.getClass(), "lastRomVersion", "ZyAecZGope");
        setField(term41499, term41499.getClass(), "lastDataVersion", "uYnmxkwLfB");
        setField(term41499, term41499.getClass(), "lastLoginDate", "RVZTQxYOUO");
        setField(term41499, term41499.getClass(), "lastPlayDate", "tydPpKxAbv");
        setIntField(term41499, term41499.getClass(), "lastPlayCredit", -1711966798);
        setIntField(term41499, term41499.getClass(), "lastPlayMode", 414375178);
        setIntField(term41499, term41499.getClass(), "lastPlaceId", -189623871);
        setField(term41499, term41499.getClass(), "lastPlaceName", "CJxQpJUfLJ");
        setIntField(term41499, term41499.getClass(), "lastAllNetId", -1500608395);
        setIntField(term41499, term41499.getClass(), "lastRegionId", -1957666898);
        setField(term41499, term41499.getClass(), "lastRegionName", "NUUjAyqOva");
        setField(term41499, term41499.getClass(), "lastClientId", "EoAMIIUdDX");
        setField(term41499, term41499.getClass(), "lastCountryCode", "OATNwRncsv");
        setIntField(term41499, term41499.getClass(), "lastSelectEMoney", -1073146570);
        setIntField(term41499, term41499.getClass(), "lastSelectTicket", -898083613);
        setIntField(term41499, term41499.getClass(), "lastSelectCourse", 1072590759);
        setIntField(term41499, term41499.getClass(), "lastCountCourse", -261873217);
        setField(term41499, term41499.getClass(), "firstGameId", "rACmzcmIPm");
        setField(term41499, term41499.getClass(), "firstRomVersion", "OCtePrLDhe");
        setField(term41499, term41499.getClass(), "firstDataVersion", "yqEphNxUPZ");
        setField(term41499, term41499.getClass(), "firstPlayDate", "mJJxTuZuKO");
        setField(term41499, term41499.getClass(), "compatibleCmVersion", "anSZCikKpS");
        setField(term41499, term41499.getClass(), "dailyBonusDate", "zvMQGbTtsV");
        setField(term41499, term41499.getClass(), "dailyCourseBonusDate", "DyUuIDzZPG");
        setField(term41499, term41499.getClass(), "lastPairLoginDate", "EGQLusEtRN");
        setField(term41499, term41499.getClass(), "lastTrialPlayDate", "GwGUMPdvZq");
        setIntField(term41499, term41499.getClass(), "playVsCount", 275234848);
        setIntField(term41499, term41499.getClass(), "playSyncCount", -400500781);
        setIntField(term41499, term41499.getClass(), "winCount", -1811725314);
        setIntField(term41499, term41499.getClass(), "helpCount", -1802258300);
        setIntField(term41499, term41499.getClass(), "comboCount", -407739204);
        setLongField(term41499, term41499.getClass(), "totalDeluxscore", -2061888799893149465L);
        setLongField(term41499, term41499.getClass(), "totalBasicDeluxscore", 8562037929535808010L);
        setLongField(term41499, term41499.getClass(), "totalAdvancedDeluxscore", 3881743260573639770L);
        setLongField(term41499, term41499.getClass(), "totalExpertDeluxscore", 4805317099230920805L);
        setLongField(term41499, term41499.getClass(), "totalMasterDeluxscore", -7774176365237911445L);
        setLongField(term41499, term41499.getClass(), "totalReMasterDeluxscore", -4171030293649718675L);
        setIntField(term41499, term41499.getClass(), "totalSync", 551650321);
        setIntField(term41499, term41499.getClass(), "totalBasicSync", 1863609082);
        setIntField(term41499, term41499.getClass(), "totalAdvancedSync", 346023694);
        setIntField(term41499, term41499.getClass(), "totalExpertSync", 1378096239);
        setIntField(term41499, term41499.getClass(), "totalMasterSync", -1082231594);
        setIntField(term41499, term41499.getClass(), "totalReMasterSync", -1775141108);
        setLongField(term41499, term41499.getClass(), "totalAchievement", 4157679554798000555L);
        setLongField(term41499, term41499.getClass(), "totalBasicAchievement", -6869725878798445523L);
        setLongField(term41499, term41499.getClass(), "totalAdvancedAchievement", -1338195308090100406L);
        setLongField(term41499, term41499.getClass(), "totalExpertAchievement", 3619359432967414857L);
        setLongField(term41499, term41499.getClass(), "totalMasterAchievement", 6722117607141885589L);
        setLongField(term41499, term41499.getClass(), "totalReMasterAchievement", -6209056926999752933L);
        setLongField(term41499, term41499.getClass(), "playerOldRating", 475071242551560384L);
        setLongField(term41499, term41499.getClass(), "playerNewRating", 279205148356106270L);
        setIntField(term41499, term41499.getClass(), "banState", -606500993);
        setLongField(term41499, term41499.getClass(), "dateTime", -3702098864254881563L);
        setField(term41497, term41497.getClass(), "user", term41499);
        setIntField(term41497, term41497.getClass(), "itemKind", 475994339);
        setIntField(term41497, term41497.getClass(), "itemId", -460066219);
        setIntField(term41497, term41497.getClass(), "stock", -1947540595);
        setBooleanField(term41497, term41497.getClass(), "isValid", true);
        term41848 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.maimai2.model.userdata.UserItem");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term41848;
        callMethod(klass, "canEqual", argTypes, term41497, args);
    }

};


