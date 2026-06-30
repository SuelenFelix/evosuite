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

public class UserData_toString_1670369377127 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term76109;

    public UserData_toString_1670369377127() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term76113 = new Long(5465527210299101732L);
        term76109 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term76111 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term76127 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term76128 = newInstance(Class.forName("java.time.LocalDate"));
        Object term76132 = newInstance(Class.forName("java.time.LocalTime"));
        Object term76137 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term76138 = newInstance(Class.forName("java.time.LocalDate"));
        Object term76142 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term76109, term76109.getClass(), "id", -8210490799564687448L);
        setLongField(term76111, term76111.getClass(), "id", 356741222742175961L);
        setField(term76111, term76111.getClass(), "extId", term76113);
        setField(term76111, term76111.getClass(), "luid", "mNzFmmNjDi");
        setIntField(term76128, term76128.getClass(), "year", 2017);
        setShortField(term76128, term76128.getClass(), "month", (short) 11);
        setShortField(term76128, term76128.getClass(), "day", (short) 19);
        setField(term76127, term76127.getClass(), "date", term76128);
        setByteField(term76132, term76132.getClass(), "hour", (byte) 2);
        setByteField(term76132, term76132.getClass(), "minute", (byte) 52);
        setByteField(term76132, term76132.getClass(), "second", (byte) 15);
        setIntField(term76132, term76132.getClass(), "nano", 625778933);
        setField(term76127, term76127.getClass(), "time", term76132);
        setField(term76111, term76111.getClass(), "registerTime", term76127);
        setIntField(term76138, term76138.getClass(), "year", 2015);
        setShortField(term76138, term76138.getClass(), "month", (short) 10);
        setShortField(term76138, term76138.getClass(), "day", (short) 3);
        setField(term76137, term76137.getClass(), "date", term76138);
        setByteField(term76142, term76142.getClass(), "hour", (byte) 10);
        setByteField(term76142, term76142.getClass(), "minute", (byte) 45);
        setByteField(term76142, term76142.getClass(), "second", (byte) 18);
        setIntField(term76142, term76142.getClass(), "nano", 333457081);
        setField(term76137, term76137.getClass(), "time", term76142);
        setField(term76111, term76111.getClass(), "accessTime", term76137);
        setField(term76109, term76109.getClass(), "card", term76111);
        setField(term76109, term76109.getClass(), "userName", "UxkbStdccR");
        setIntField(term76109, term76109.getClass(), "level", -1867952163);
        setIntField(term76109, term76109.getClass(), "reincarnationNum", -1770219455);
        setLongField(term76109, term76109.getClass(), "exp", -8559116967513378447L);
        setLongField(term76109, term76109.getClass(), "point", 8349089013897192154L);
        setLongField(term76109, term76109.getClass(), "totalPoint", -8293657191511549595L);
        setIntField(term76109, term76109.getClass(), "playCount", -993930773);
        setIntField(term76109, term76109.getClass(), "jewelCount", 1436841795);
        setIntField(term76109, term76109.getClass(), "totalJewelCount", 248838167);
        setIntField(term76109, term76109.getClass(), "medalCount", 1957931763);
        setIntField(term76109, term76109.getClass(), "playerRating", -845283401);
        setIntField(term76109, term76109.getClass(), "highestRating", 1423298146);
        setIntField(term76109, term76109.getClass(), "battlePoint", 168549967);
        setIntField(term76109, term76109.getClass(), "bestBattlePoint", 1631903694);
        setIntField(term76109, term76109.getClass(), "overDamageBattlePoint", 483088872);
        setBooleanField(term76109, term76109.getClass(), "isDialogWatchedSuggestMemory", true);
        setIntField(term76109, term76109.getClass(), "nameplateId", 157859356);
        setIntField(term76109, term76109.getClass(), "trophyId", 1788509099);
        setIntField(term76109, term76109.getClass(), "cardId", -407602685);
        setIntField(term76109, term76109.getClass(), "characterId", -484929244);
        setIntField(term76109, term76109.getClass(), "characterVoiceNo", -1316734168);
        setIntField(term76109, term76109.getClass(), "tabSetting", 1973373652);
        setIntField(term76109, term76109.getClass(), "tabSortSetting", 1574921912);
        setIntField(term76109, term76109.getClass(), "cardCategorySetting", -1117910274);
        setIntField(term76109, term76109.getClass(), "cardSortSetting", 759727183);
        setIntField(term76109, term76109.getClass(), "rivalScoreCategorySetting", 383595991);
        setIntField(term76109, term76109.getClass(), "playedTutorialBit", 1736367900);
        setIntField(term76109, term76109.getClass(), "firstTutorialCancelNum", -1181229958);
        setLongField(term76109, term76109.getClass(), "sumTechHighScore", 983004662906620981L);
        setLongField(term76109, term76109.getClass(), "sumTechBasicHighScore", 3758170717522532837L);
        setLongField(term76109, term76109.getClass(), "sumTechAdvancedHighScore", -2722365438824574372L);
        setLongField(term76109, term76109.getClass(), "sumTechExpertHighScore", -3033059928142333838L);
        setLongField(term76109, term76109.getClass(), "sumTechMasterHighScore", -3701403882243337652L);
        setLongField(term76109, term76109.getClass(), "sumTechLunaticHighScore", 3650995192859131287L);
        setLongField(term76109, term76109.getClass(), "sumBattleHighScore", -3086678982095395565L);
        setLongField(term76109, term76109.getClass(), "sumBattleBasicHighScore", 1848320676893390599L);
        setLongField(term76109, term76109.getClass(), "sumBattleAdvancedHighScore", 1438339111595747474L);
        setLongField(term76109, term76109.getClass(), "sumBattleExpertHighScore", -1978911449948440575L);
        setLongField(term76109, term76109.getClass(), "sumBattleMasterHighScore", 482416668389920900L);
        setLongField(term76109, term76109.getClass(), "sumBattleLunaticHighScore", -3964336945442391045L);
        setField(term76109, term76109.getClass(), "eventWatchedDate", "kizVhsjIpC");
        setField(term76109, term76109.getClass(), "cmEventWatchedDate", "uDuPkYdemJ");
        setField(term76109, term76109.getClass(), "firstGameId", "FfynoMXicS");
        setField(term76109, term76109.getClass(), "firstRomVersion", "mbofhtwtHb");
        setField(term76109, term76109.getClass(), "firstDataVersion", "goCKhChLTQ");
        setField(term76109, term76109.getClass(), "firstPlayDate", "VkjCLLOwvZ");
        setField(term76109, term76109.getClass(), "lastGameId", "YQaoPDOhWH");
        setField(term76109, term76109.getClass(), "lastRomVersion", "SJPzCePrEj");
        setField(term76109, term76109.getClass(), "lastDataVersion", "tYasEQgFbL");
        setField(term76109, term76109.getClass(), "compatibleCmVersion", "hqURWIdULb");
        setField(term76109, term76109.getClass(), "lastPlayDate", "kWDcKMrObe");
        setIntField(term76109, term76109.getClass(), "lastPlaceId", -341744470);
        setField(term76109, term76109.getClass(), "lastPlaceName", "yQIuIaxdRt");
        setIntField(term76109, term76109.getClass(), "lastRegionId", -1112768944);
        setField(term76109, term76109.getClass(), "lastRegionName", "mppqyavbHE");
        setIntField(term76109, term76109.getClass(), "lastAllNetId", -1300523076);
        setField(term76109, term76109.getClass(), "lastClientId", "XRhNVGJlMP");
        setIntField(term76109, term76109.getClass(), "lastUsedDeckId", -1136236336);
        setIntField(term76109, term76109.getClass(), "lastPlayMusicLevel", 935191824);
        setIntField(term76109, term76109.getClass(), "lastEmoneyBrand", 290423749);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term76109, args);
    }

};


