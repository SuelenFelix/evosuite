package icu.samnyan.aqua.sega.ongeki.model.userdata;

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
import static icu.samnyan.aqua.sega.ongeki.model.userdata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Long;

public class UserCard_getId_14385690632 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term111731;

    public UserCard_getId_14385690632() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term111737 = new Long(3752337209837437327L);
        term111731 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserCard"));
        Object term111733 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term111735 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term111751 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term111752 = newInstance(Class.forName("java.time.LocalDate"));
        Object term111756 = newInstance(Class.forName("java.time.LocalTime"));
        Object term111761 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term111762 = newInstance(Class.forName("java.time.LocalDate"));
        Object term111766 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term111731, term111731.getClass(), "id", 6630507826496734913L);
        setLongField(term111733, term111733.getClass(), "id", 5719596661545294090L);
        setLongField(term111735, term111735.getClass(), "id", -664722832451062617L);
        setField(term111735, term111735.getClass(), "extId", term111737);
        setField(term111735, term111735.getClass(), "luid", "zAaRUjWcRI");
        setIntField(term111752, term111752.getClass(), "year", 2017);
        setShortField(term111752, term111752.getClass(), "month", (short) 8);
        setShortField(term111752, term111752.getClass(), "day", (short) 31);
        setField(term111751, term111751.getClass(), "date", term111752);
        setByteField(term111756, term111756.getClass(), "hour", (byte) 12);
        setByteField(term111756, term111756.getClass(), "minute", (byte) 32);
        setByteField(term111756, term111756.getClass(), "second", (byte) 28);
        setIntField(term111756, term111756.getClass(), "nano", 428210685);
        setField(term111751, term111751.getClass(), "time", term111756);
        setField(term111735, term111735.getClass(), "registerTime", term111751);
        setIntField(term111762, term111762.getClass(), "year", 2013);
        setShortField(term111762, term111762.getClass(), "month", (short) 8);
        setShortField(term111762, term111762.getClass(), "day", (short) 27);
        setField(term111761, term111761.getClass(), "date", term111762);
        setByteField(term111766, term111766.getClass(), "hour", (byte) 16);
        setByteField(term111766, term111766.getClass(), "minute", (byte) 55);
        setByteField(term111766, term111766.getClass(), "second", (byte) 23);
        setIntField(term111766, term111766.getClass(), "nano", 979193613);
        setField(term111761, term111761.getClass(), "time", term111766);
        setField(term111735, term111735.getClass(), "accessTime", term111761);
        setField(term111733, term111733.getClass(), "card", term111735);
        setField(term111733, term111733.getClass(), "userName", "biuSELVcRS");
        setIntField(term111733, term111733.getClass(), "level", -59756804);
        setIntField(term111733, term111733.getClass(), "reincarnationNum", 535818399);
        setLongField(term111733, term111733.getClass(), "exp", -6536668541379007949L);
        setLongField(term111733, term111733.getClass(), "point", -6718599490439905146L);
        setLongField(term111733, term111733.getClass(), "totalPoint", -5659945218409257097L);
        setIntField(term111733, term111733.getClass(), "playCount", 1397433354);
        setIntField(term111733, term111733.getClass(), "jewelCount", -135791025);
        setIntField(term111733, term111733.getClass(), "totalJewelCount", 59811366);
        setIntField(term111733, term111733.getClass(), "medalCount", 874873727);
        setIntField(term111733, term111733.getClass(), "playerRating", 729829705);
        setIntField(term111733, term111733.getClass(), "highestRating", 713554336);
        setIntField(term111733, term111733.getClass(), "battlePoint", 196738357);
        setIntField(term111733, term111733.getClass(), "bestBattlePoint", 466094589);
        setIntField(term111733, term111733.getClass(), "overDamageBattlePoint", -1165526360);
        setBooleanField(term111733, term111733.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term111733, term111733.getClass(), "nameplateId", -1358499449);
        setIntField(term111733, term111733.getClass(), "trophyId", -1565850896);
        setIntField(term111733, term111733.getClass(), "cardId", 1480628140);
        setIntField(term111733, term111733.getClass(), "characterId", -1804417815);
        setIntField(term111733, term111733.getClass(), "characterVoiceNo", -988341618);
        setIntField(term111733, term111733.getClass(), "tabSetting", 892061109);
        setIntField(term111733, term111733.getClass(), "tabSortSetting", 1044749648);
        setIntField(term111733, term111733.getClass(), "cardCategorySetting", -2066536273);
        setIntField(term111733, term111733.getClass(), "cardSortSetting", -1532896934);
        setIntField(term111733, term111733.getClass(), "rivalScoreCategorySetting", -1907871387);
        setIntField(term111733, term111733.getClass(), "playedTutorialBit", 11100609);
        setIntField(term111733, term111733.getClass(), "firstTutorialCancelNum", -747715686);
        setLongField(term111733, term111733.getClass(), "sumTechHighScore", 5212528572898952367L);
        setLongField(term111733, term111733.getClass(), "sumTechBasicHighScore", 790025652601056971L);
        setLongField(term111733, term111733.getClass(), "sumTechAdvancedHighScore", -6784000879494141160L);
        setLongField(term111733, term111733.getClass(), "sumTechExpertHighScore", 7165092158183775402L);
        setLongField(term111733, term111733.getClass(), "sumTechMasterHighScore", -1537631677069895771L);
        setLongField(term111733, term111733.getClass(), "sumTechLunaticHighScore", 36196262654446064L);
        setLongField(term111733, term111733.getClass(), "sumBattleHighScore", -4292086737524903255L);
        setLongField(term111733, term111733.getClass(), "sumBattleBasicHighScore", -5883854887134493687L);
        setLongField(term111733, term111733.getClass(), "sumBattleAdvancedHighScore", 6728694933707773867L);
        setLongField(term111733, term111733.getClass(), "sumBattleExpertHighScore", 6854173842534294346L);
        setLongField(term111733, term111733.getClass(), "sumBattleMasterHighScore", 4128983721401052268L);
        setLongField(term111733, term111733.getClass(), "sumBattleLunaticHighScore", -6342735604128832610L);
        setField(term111733, term111733.getClass(), "eventWatchedDate", "QvIFmvEUyM");
        setField(term111733, term111733.getClass(), "cmEventWatchedDate", "WIZrBpMEJd");
        setField(term111733, term111733.getClass(), "firstGameId", "judJxGaXAJ");
        setField(term111733, term111733.getClass(), "firstRomVersion", "YyIBJVokET");
        setField(term111733, term111733.getClass(), "firstDataVersion", "oUsLXfeBhj");
        setField(term111733, term111733.getClass(), "firstPlayDate", "dNmDNoDsCT");
        setField(term111733, term111733.getClass(), "lastGameId", "FKYroLkXZi");
        setField(term111733, term111733.getClass(), "lastRomVersion", "qnoyvZRqBI");
        setField(term111733, term111733.getClass(), "lastDataVersion", "iBRFyvlgRW");
        setField(term111733, term111733.getClass(), "compatibleCmVersion", "UjtHbgdpKi");
        setField(term111733, term111733.getClass(), "lastPlayDate", "QZUqVBZaTe");
        setIntField(term111733, term111733.getClass(), "lastPlaceId", -1565507534);
        setField(term111733, term111733.getClass(), "lastPlaceName", "ulsJyRLpjn");
        setIntField(term111733, term111733.getClass(), "lastRegionId", -1665001312);
        setField(term111733, term111733.getClass(), "lastRegionName", "mPvRCwfDas");
        setIntField(term111733, term111733.getClass(), "lastAllNetId", -904092395);
        setField(term111733, term111733.getClass(), "lastClientId", "XTbkEKEVGp");
        setIntField(term111733, term111733.getClass(), "lastUsedDeckId", -1209882989);
        setIntField(term111733, term111733.getClass(), "lastPlayMusicLevel", -635477822);
        setIntField(term111733, term111733.getClass(), "lastEmoneyBrand", -1577181902);
        setField(term111731, term111731.getClass(), "user", term111733);
        setIntField(term111731, term111731.getClass(), "cardId", -1);
        setIntField(term111731, term111731.getClass(), "digitalStock", 1);
        setIntField(term111731, term111731.getClass(), "analogStock", 1943392765);
        setIntField(term111731, term111731.getClass(), "level", -1788693144);
        setIntField(term111731, term111731.getClass(), "maxLevel", 10);
        setIntField(term111731, term111731.getClass(), "exp", 1939961371);
        setIntField(term111731, term111731.getClass(), "printCount", 435301324);
        setIntField(term111731, term111731.getClass(), "useCount", -1422958225);
        setBooleanField(term111731, term111731.getClass(), "isNew", true);
        setField(term111731, term111731.getClass(), "kaikaDate", "0000-00-00 00:00:00.0");
        setField(term111731, term111731.getClass(), "choKaikaDate", "0000-00-00 00:00:00.0");
        setIntField(term111731, term111731.getClass(), "skillId", 1608477594);
        setBooleanField(term111731, term111731.getClass(), "isAcquired", true);
        setField(term111731, term111731.getClass(), "created", "0000-00-00 00:00:00.0");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserCard");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term111731, args);
    }

};


