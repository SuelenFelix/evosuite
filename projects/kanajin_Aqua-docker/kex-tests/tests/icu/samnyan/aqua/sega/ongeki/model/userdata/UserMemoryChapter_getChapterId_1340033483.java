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

public class UserMemoryChapter_getChapterId_1340033483 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term390206;

    public UserMemoryChapter_getChapterId_1340033483() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term390212 = new Long(593230449611047187L);
        term390206 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserMemoryChapter"));
        Object term390208 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term390210 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term390226 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term390227 = newInstance(Class.forName("java.time.LocalDate"));
        Object term390231 = newInstance(Class.forName("java.time.LocalTime"));
        Object term390236 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term390237 = newInstance(Class.forName("java.time.LocalDate"));
        Object term390241 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term390206, term390206.getClass(), "id", -1861824160148815906L);
        setLongField(term390208, term390208.getClass(), "id", 6984072138346084111L);
        setLongField(term390210, term390210.getClass(), "id", 8121720627030450709L);
        setField(term390210, term390210.getClass(), "extId", term390212);
        setField(term390210, term390210.getClass(), "luid", "oTPLwQkEmT");
        setIntField(term390227, term390227.getClass(), "year", 2021);
        setShortField(term390227, term390227.getClass(), "month", (short) 8);
        setShortField(term390227, term390227.getClass(), "day", (short) 11);
        setField(term390226, term390226.getClass(), "date", term390227);
        setByteField(term390231, term390231.getClass(), "hour", (byte) 17);
        setByteField(term390231, term390231.getClass(), "minute", (byte) 23);
        setByteField(term390231, term390231.getClass(), "second", (byte) 44);
        setIntField(term390231, term390231.getClass(), "nano", 259629307);
        setField(term390226, term390226.getClass(), "time", term390231);
        setField(term390210, term390210.getClass(), "registerTime", term390226);
        setIntField(term390237, term390237.getClass(), "year", 2015);
        setShortField(term390237, term390237.getClass(), "month", (short) 7);
        setShortField(term390237, term390237.getClass(), "day", (short) 18);
        setField(term390236, term390236.getClass(), "date", term390237);
        setByteField(term390241, term390241.getClass(), "hour", (byte) 12);
        setByteField(term390241, term390241.getClass(), "minute", (byte) 57);
        setByteField(term390241, term390241.getClass(), "second", (byte) 55);
        setIntField(term390241, term390241.getClass(), "nano", 807129715);
        setField(term390236, term390236.getClass(), "time", term390241);
        setField(term390210, term390210.getClass(), "accessTime", term390236);
        setField(term390208, term390208.getClass(), "card", term390210);
        setField(term390208, term390208.getClass(), "userName", "xFkndnYbpH");
        setIntField(term390208, term390208.getClass(), "level", 1694435744);
        setIntField(term390208, term390208.getClass(), "reincarnationNum", 1259136422);
        setLongField(term390208, term390208.getClass(), "exp", -8883119307583837968L);
        setLongField(term390208, term390208.getClass(), "point", -6247957055809397740L);
        setLongField(term390208, term390208.getClass(), "totalPoint", -6648704301740000097L);
        setIntField(term390208, term390208.getClass(), "playCount", 1587010751);
        setIntField(term390208, term390208.getClass(), "jewelCount", 1895691381);
        setIntField(term390208, term390208.getClass(), "totalJewelCount", -646871644);
        setIntField(term390208, term390208.getClass(), "medalCount", -1192909644);
        setIntField(term390208, term390208.getClass(), "playerRating", 1852105788);
        setIntField(term390208, term390208.getClass(), "highestRating", -1649114372);
        setIntField(term390208, term390208.getClass(), "battlePoint", -622586943);
        setIntField(term390208, term390208.getClass(), "bestBattlePoint", -1518440335);
        setIntField(term390208, term390208.getClass(), "overDamageBattlePoint", 1451028314);
        setBooleanField(term390208, term390208.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term390208, term390208.getClass(), "nameplateId", -1695166129);
        setIntField(term390208, term390208.getClass(), "trophyId", 531351716);
        setIntField(term390208, term390208.getClass(), "cardId", 1907315122);
        setIntField(term390208, term390208.getClass(), "characterId", 1709551824);
        setIntField(term390208, term390208.getClass(), "characterVoiceNo", -1536600036);
        setIntField(term390208, term390208.getClass(), "tabSetting", -2054715083);
        setIntField(term390208, term390208.getClass(), "tabSortSetting", -830530443);
        setIntField(term390208, term390208.getClass(), "cardCategorySetting", -1413112183);
        setIntField(term390208, term390208.getClass(), "cardSortSetting", 1955556267);
        setIntField(term390208, term390208.getClass(), "rivalScoreCategorySetting", 1486776860);
        setIntField(term390208, term390208.getClass(), "playedTutorialBit", 116568850);
        setIntField(term390208, term390208.getClass(), "firstTutorialCancelNum", -1493940533);
        setLongField(term390208, term390208.getClass(), "sumTechHighScore", -8934533886895484071L);
        setLongField(term390208, term390208.getClass(), "sumTechBasicHighScore", -4908487413092383372L);
        setLongField(term390208, term390208.getClass(), "sumTechAdvancedHighScore", 177219061216457769L);
        setLongField(term390208, term390208.getClass(), "sumTechExpertHighScore", 4332808466795568282L);
        setLongField(term390208, term390208.getClass(), "sumTechMasterHighScore", -4944925423698874446L);
        setLongField(term390208, term390208.getClass(), "sumTechLunaticHighScore", -6400720071664745009L);
        setLongField(term390208, term390208.getClass(), "sumBattleHighScore", -3998241159702464397L);
        setLongField(term390208, term390208.getClass(), "sumBattleBasicHighScore", 8535075473882209383L);
        setLongField(term390208, term390208.getClass(), "sumBattleAdvancedHighScore", 8745247182838849755L);
        setLongField(term390208, term390208.getClass(), "sumBattleExpertHighScore", 1051487121679551637L);
        setLongField(term390208, term390208.getClass(), "sumBattleMasterHighScore", -7502389603229532112L);
        setLongField(term390208, term390208.getClass(), "sumBattleLunaticHighScore", -9109424427608859411L);
        setField(term390208, term390208.getClass(), "eventWatchedDate", "dBldAjnGFk");
        setField(term390208, term390208.getClass(), "cmEventWatchedDate", "hUMhHLhaKd");
        setField(term390208, term390208.getClass(), "firstGameId", "STwUVssQRE");
        setField(term390208, term390208.getClass(), "firstRomVersion", "ZwAHflqzKe");
        setField(term390208, term390208.getClass(), "firstDataVersion", "aljMECpqLg");
        setField(term390208, term390208.getClass(), "firstPlayDate", "JicAXKPhit");
        setField(term390208, term390208.getClass(), "lastGameId", "fOCBKWcqat");
        setField(term390208, term390208.getClass(), "lastRomVersion", "mHjIBmFiJT");
        setField(term390208, term390208.getClass(), "lastDataVersion", "KpdFuIpvff");
        setField(term390208, term390208.getClass(), "compatibleCmVersion", "lVIJLTOzMM");
        setField(term390208, term390208.getClass(), "lastPlayDate", "LFjxPCDaIV");
        setIntField(term390208, term390208.getClass(), "lastPlaceId", 1726207026);
        setField(term390208, term390208.getClass(), "lastPlaceName", "gupqeuvUuX");
        setIntField(term390208, term390208.getClass(), "lastRegionId", 914752391);
        setField(term390208, term390208.getClass(), "lastRegionName", "hhSdOhEtdp");
        setIntField(term390208, term390208.getClass(), "lastAllNetId", -1984902992);
        setField(term390208, term390208.getClass(), "lastClientId", "XzJbmVHytX");
        setIntField(term390208, term390208.getClass(), "lastUsedDeckId", -598191204);
        setIntField(term390208, term390208.getClass(), "lastPlayMusicLevel", -853469336);
        setIntField(term390208, term390208.getClass(), "lastEmoneyBrand", -59523799);
        setField(term390206, term390206.getClass(), "user", term390208);
        setIntField(term390206, term390206.getClass(), "chapterId", 704304890);
        setIntField(term390206, term390206.getClass(), "jewelCount", -946347936);
        setIntField(term390206, term390206.getClass(), "lastPlayMusicCategory", 41305943);
        setIntField(term390206, term390206.getClass(), "lastPlayMusicId", -798468475);
        setIntField(term390206, term390206.getClass(), "lastPlayMusicLevel", -1168950511);
        setBooleanField(term390206, term390206.getClass(), "isDialogWatched", true);
        setBooleanField(term390206, term390206.getClass(), "isStoryWatched", true);
        setBooleanField(term390206, term390206.getClass(), "isBossWatched", true);
        setBooleanField(term390206, term390206.getClass(), "isClear", true);
        setIntField(term390206, term390206.getClass(), "gaugeId", 986056134);
        setIntField(term390206, term390206.getClass(), "gaugeNum", -1035310474);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserMemoryChapter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getChapterId", argTypes, term390206, args);
    }

};


