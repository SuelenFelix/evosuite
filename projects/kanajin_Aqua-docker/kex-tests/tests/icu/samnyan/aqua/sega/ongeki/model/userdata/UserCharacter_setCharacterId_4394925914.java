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
import java.lang.Integer;

public class UserCharacter_setCharacterId_4394925914 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term174504;
     Object term174789;

    public UserCharacter_setCharacterId_4394925914() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term174510 = new Long(-1465819833800717311L);
        term174504 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserCharacter"));
        Object term174506 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term174508 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term174524 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term174525 = newInstance(Class.forName("java.time.LocalDate"));
        Object term174529 = newInstance(Class.forName("java.time.LocalTime"));
        Object term174534 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term174535 = newInstance(Class.forName("java.time.LocalDate"));
        Object term174539 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term174504, term174504.getClass(), "id", 4718014703042298733L);
        setLongField(term174506, term174506.getClass(), "id", -4136071709153486481L);
        setLongField(term174508, term174508.getClass(), "id", -7434060125622887962L);
        setField(term174508, term174508.getClass(), "extId", term174510);
        setField(term174508, term174508.getClass(), "luid", "FqefqveUEm");
        setIntField(term174525, term174525.getClass(), "year", 2010);
        setShortField(term174525, term174525.getClass(), "month", (short) 11);
        setShortField(term174525, term174525.getClass(), "day", (short) 7);
        setField(term174524, term174524.getClass(), "date", term174525);
        setByteField(term174529, term174529.getClass(), "hour", (byte) 17);
        setByteField(term174529, term174529.getClass(), "minute", (byte) 2);
        setByteField(term174529, term174529.getClass(), "second", (byte) 45);
        setIntField(term174529, term174529.getClass(), "nano", 891551261);
        setField(term174524, term174524.getClass(), "time", term174529);
        setField(term174508, term174508.getClass(), "registerTime", term174524);
        setIntField(term174535, term174535.getClass(), "year", 2018);
        setShortField(term174535, term174535.getClass(), "month", (short) 4);
        setShortField(term174535, term174535.getClass(), "day", (short) 19);
        setField(term174534, term174534.getClass(), "date", term174535);
        setByteField(term174539, term174539.getClass(), "hour", (byte) 14);
        setByteField(term174539, term174539.getClass(), "minute", (byte) 21);
        setByteField(term174539, term174539.getClass(), "second", (byte) 19);
        setIntField(term174539, term174539.getClass(), "nano", 997536814);
        setField(term174534, term174534.getClass(), "time", term174539);
        setField(term174508, term174508.getClass(), "accessTime", term174534);
        setField(term174506, term174506.getClass(), "card", term174508);
        setField(term174506, term174506.getClass(), "userName", "FbqShgWywz");
        setIntField(term174506, term174506.getClass(), "level", 969867590);
        setIntField(term174506, term174506.getClass(), "reincarnationNum", 779493218);
        setLongField(term174506, term174506.getClass(), "exp", 3061844783583932944L);
        setLongField(term174506, term174506.getClass(), "point", 579647697066713042L);
        setLongField(term174506, term174506.getClass(), "totalPoint", 8047197957641770490L);
        setIntField(term174506, term174506.getClass(), "playCount", -1446558435);
        setIntField(term174506, term174506.getClass(), "jewelCount", -1399316678);
        setIntField(term174506, term174506.getClass(), "totalJewelCount", -1519298903);
        setIntField(term174506, term174506.getClass(), "medalCount", 1252279814);
        setIntField(term174506, term174506.getClass(), "playerRating", 2029611458);
        setIntField(term174506, term174506.getClass(), "highestRating", -1637128814);
        setIntField(term174506, term174506.getClass(), "battlePoint", -299574855);
        setIntField(term174506, term174506.getClass(), "bestBattlePoint", 1862891065);
        setIntField(term174506, term174506.getClass(), "overDamageBattlePoint", -1627096493);
        setBooleanField(term174506, term174506.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term174506, term174506.getClass(), "nameplateId", 1307068962);
        setIntField(term174506, term174506.getClass(), "trophyId", 344822691);
        setIntField(term174506, term174506.getClass(), "cardId", 1748471450);
        setIntField(term174506, term174506.getClass(), "characterId", 6001794);
        setIntField(term174506, term174506.getClass(), "characterVoiceNo", -219230289);
        setIntField(term174506, term174506.getClass(), "tabSetting", -1289281350);
        setIntField(term174506, term174506.getClass(), "tabSortSetting", -371133839);
        setIntField(term174506, term174506.getClass(), "cardCategorySetting", -1810597085);
        setIntField(term174506, term174506.getClass(), "cardSortSetting", -486804348);
        setIntField(term174506, term174506.getClass(), "rivalScoreCategorySetting", 432945474);
        setIntField(term174506, term174506.getClass(), "playedTutorialBit", -725203984);
        setIntField(term174506, term174506.getClass(), "firstTutorialCancelNum", 1848180003);
        setLongField(term174506, term174506.getClass(), "sumTechHighScore", 390732796135404621L);
        setLongField(term174506, term174506.getClass(), "sumTechBasicHighScore", -1313429829170420807L);
        setLongField(term174506, term174506.getClass(), "sumTechAdvancedHighScore", 4646468012048228694L);
        setLongField(term174506, term174506.getClass(), "sumTechExpertHighScore", 1076765182729234215L);
        setLongField(term174506, term174506.getClass(), "sumTechMasterHighScore", 7483921550995914675L);
        setLongField(term174506, term174506.getClass(), "sumTechLunaticHighScore", 578586871524293101L);
        setLongField(term174506, term174506.getClass(), "sumBattleHighScore", 146593563962570001L);
        setLongField(term174506, term174506.getClass(), "sumBattleBasicHighScore", -7026476516621146038L);
        setLongField(term174506, term174506.getClass(), "sumBattleAdvancedHighScore", 1672998899023933550L);
        setLongField(term174506, term174506.getClass(), "sumBattleExpertHighScore", 1713676158068956691L);
        setLongField(term174506, term174506.getClass(), "sumBattleMasterHighScore", -3353280215933613893L);
        setLongField(term174506, term174506.getClass(), "sumBattleLunaticHighScore", -8223688673118674950L);
        setField(term174506, term174506.getClass(), "eventWatchedDate", "PGCkOOXhFQ");
        setField(term174506, term174506.getClass(), "cmEventWatchedDate", "CoBoCTiUwR");
        setField(term174506, term174506.getClass(), "firstGameId", "pOuvSObkno");
        setField(term174506, term174506.getClass(), "firstRomVersion", "XEisjHLmCq");
        setField(term174506, term174506.getClass(), "firstDataVersion", "mFWTMYClgX");
        setField(term174506, term174506.getClass(), "firstPlayDate", "soLsoaYFpk");
        setField(term174506, term174506.getClass(), "lastGameId", "mnlIQSXPGY");
        setField(term174506, term174506.getClass(), "lastRomVersion", "sEEAPMAXyN");
        setField(term174506, term174506.getClass(), "lastDataVersion", "IlnVxfvxud");
        setField(term174506, term174506.getClass(), "compatibleCmVersion", "PXbTEdLdxv");
        setField(term174506, term174506.getClass(), "lastPlayDate", "sAQnfpCFaF");
        setIntField(term174506, term174506.getClass(), "lastPlaceId", 846315597);
        setField(term174506, term174506.getClass(), "lastPlaceName", "SDTnklEgzd");
        setIntField(term174506, term174506.getClass(), "lastRegionId", 1008300939);
        setField(term174506, term174506.getClass(), "lastRegionName", "fxTJBYpJaC");
        setIntField(term174506, term174506.getClass(), "lastAllNetId", -1286668613);
        setField(term174506, term174506.getClass(), "lastClientId", "HMBJcDndyB");
        setIntField(term174506, term174506.getClass(), "lastUsedDeckId", -789358664);
        setIntField(term174506, term174506.getClass(), "lastPlayMusicLevel", -2034774971);
        setIntField(term174506, term174506.getClass(), "lastEmoneyBrand", 481530689);
        setField(term174504, term174504.getClass(), "user", term174506);
        setIntField(term174504, term174504.getClass(), "characterId", -1951222103);
        setIntField(term174504, term174504.getClass(), "costumeId", -1949169702);
        setIntField(term174504, term174504.getClass(), "attachmentId", 1058646419);
        setIntField(term174504, term174504.getClass(), "playCount", 540736002);
        setIntField(term174504, term174504.getClass(), "intimateLevel", 145817292);
        setIntField(term174504, term174504.getClass(), "intimateCount", -88949007);
        setIntField(term174504, term174504.getClass(), "intimateCountRewarded", -927282703);
        setField(term174504, term174504.getClass(), "intimateCountDate", "RtVzHDrrjO");
        setBooleanField(term174504, term174504.getClass(), "isNew", true);
        term174789 = new Integer(-1638986447);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserCharacter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term174789;
        callMethod(klass, "setCharacterId", argTypes, term174504, args);
    }

};


