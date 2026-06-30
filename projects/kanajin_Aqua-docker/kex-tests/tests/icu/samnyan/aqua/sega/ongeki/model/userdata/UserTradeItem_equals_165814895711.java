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

public class UserTradeItem_equals_165814895711 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term155403;
     Object term155671;

    public UserTradeItem_equals_165814895711() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term155409 = new Long(-5871746020807491998L);
        term155403 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserTradeItem"));
        Object term155405 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term155407 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term155423 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term155424 = newInstance(Class.forName("java.time.LocalDate"));
        Object term155428 = newInstance(Class.forName("java.time.LocalTime"));
        Object term155433 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term155434 = newInstance(Class.forName("java.time.LocalDate"));
        Object term155438 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term155403, term155403.getClass(), "id", -6151359199860064110L);
        setLongField(term155405, term155405.getClass(), "id", 7248988630031261484L);
        setLongField(term155407, term155407.getClass(), "id", 3319565167580239453L);
        setField(term155407, term155407.getClass(), "extId", term155409);
        setField(term155407, term155407.getClass(), "luid", "qyKAThLlxF");
        setIntField(term155424, term155424.getClass(), "year", 2015);
        setShortField(term155424, term155424.getClass(), "month", (short) 6);
        setShortField(term155424, term155424.getClass(), "day", (short) 1);
        setField(term155423, term155423.getClass(), "date", term155424);
        setByteField(term155428, term155428.getClass(), "hour", (byte) 5);
        setByteField(term155428, term155428.getClass(), "minute", (byte) 44);
        setByteField(term155428, term155428.getClass(), "second", (byte) 48);
        setIntField(term155428, term155428.getClass(), "nano", 654356179);
        setField(term155423, term155423.getClass(), "time", term155428);
        setField(term155407, term155407.getClass(), "registerTime", term155423);
        setIntField(term155434, term155434.getClass(), "year", 2027);
        setShortField(term155434, term155434.getClass(), "month", (short) 10);
        setShortField(term155434, term155434.getClass(), "day", (short) 12);
        setField(term155433, term155433.getClass(), "date", term155434);
        setByteField(term155438, term155438.getClass(), "hour", (byte) 16);
        setByteField(term155438, term155438.getClass(), "minute", (byte) 59);
        setByteField(term155438, term155438.getClass(), "second", (byte) 46);
        setIntField(term155438, term155438.getClass(), "nano", 525561936);
        setField(term155433, term155433.getClass(), "time", term155438);
        setField(term155407, term155407.getClass(), "accessTime", term155433);
        setField(term155405, term155405.getClass(), "card", term155407);
        setField(term155405, term155405.getClass(), "userName", "QASMnlCopd");
        setIntField(term155405, term155405.getClass(), "level", -1002047965);
        setIntField(term155405, term155405.getClass(), "reincarnationNum", 1634880098);
        setLongField(term155405, term155405.getClass(), "exp", 7665122090516509718L);
        setLongField(term155405, term155405.getClass(), "point", -8965803539495697005L);
        setLongField(term155405, term155405.getClass(), "totalPoint", -769464752627615058L);
        setIntField(term155405, term155405.getClass(), "playCount", 1459664470);
        setIntField(term155405, term155405.getClass(), "jewelCount", 390456498);
        setIntField(term155405, term155405.getClass(), "totalJewelCount", -75818278);
        setIntField(term155405, term155405.getClass(), "medalCount", -638713910);
        setIntField(term155405, term155405.getClass(), "playerRating", 1047195730);
        setIntField(term155405, term155405.getClass(), "highestRating", -1089490394);
        setIntField(term155405, term155405.getClass(), "battlePoint", 1288764916);
        setIntField(term155405, term155405.getClass(), "bestBattlePoint", -1590776943);
        setIntField(term155405, term155405.getClass(), "overDamageBattlePoint", -55708653);
        setBooleanField(term155405, term155405.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term155405, term155405.getClass(), "nameplateId", -618645376);
        setIntField(term155405, term155405.getClass(), "trophyId", -1757025350);
        setIntField(term155405, term155405.getClass(), "cardId", 241494222);
        setIntField(term155405, term155405.getClass(), "characterId", -1394120293);
        setIntField(term155405, term155405.getClass(), "characterVoiceNo", 1365082165);
        setIntField(term155405, term155405.getClass(), "tabSetting", 237330727);
        setIntField(term155405, term155405.getClass(), "tabSortSetting", 1865561086);
        setIntField(term155405, term155405.getClass(), "cardCategorySetting", -1717770104);
        setIntField(term155405, term155405.getClass(), "cardSortSetting", 1002436799);
        setIntField(term155405, term155405.getClass(), "rivalScoreCategorySetting", 491797710);
        setIntField(term155405, term155405.getClass(), "playedTutorialBit", -528313320);
        setIntField(term155405, term155405.getClass(), "firstTutorialCancelNum", 1438707097);
        setLongField(term155405, term155405.getClass(), "sumTechHighScore", -2001410532006219304L);
        setLongField(term155405, term155405.getClass(), "sumTechBasicHighScore", 9027162258119014420L);
        setLongField(term155405, term155405.getClass(), "sumTechAdvancedHighScore", 4655675274816076457L);
        setLongField(term155405, term155405.getClass(), "sumTechExpertHighScore", 597217404486026348L);
        setLongField(term155405, term155405.getClass(), "sumTechMasterHighScore", 5688461670703265476L);
        setLongField(term155405, term155405.getClass(), "sumTechLunaticHighScore", 8535417948216692452L);
        setLongField(term155405, term155405.getClass(), "sumBattleHighScore", -5021693087855771193L);
        setLongField(term155405, term155405.getClass(), "sumBattleBasicHighScore", 2423882333498629620L);
        setLongField(term155405, term155405.getClass(), "sumBattleAdvancedHighScore", 8143587516001075223L);
        setLongField(term155405, term155405.getClass(), "sumBattleExpertHighScore", -2880696179980955672L);
        setLongField(term155405, term155405.getClass(), "sumBattleMasterHighScore", -1549794059683791613L);
        setLongField(term155405, term155405.getClass(), "sumBattleLunaticHighScore", 5478152063012904859L);
        setField(term155405, term155405.getClass(), "eventWatchedDate", "YwgBBLYGUf");
        setField(term155405, term155405.getClass(), "cmEventWatchedDate", "GmUcxwDIHd");
        setField(term155405, term155405.getClass(), "firstGameId", "DONVlTbOjd");
        setField(term155405, term155405.getClass(), "firstRomVersion", "fLWpUJgZWD");
        setField(term155405, term155405.getClass(), "firstDataVersion", "zpxPoasWgA");
        setField(term155405, term155405.getClass(), "firstPlayDate", "lZNePPEWLC");
        setField(term155405, term155405.getClass(), "lastGameId", "XyvyWBkpUr");
        setField(term155405, term155405.getClass(), "lastRomVersion", "AuUQylJqWv");
        setField(term155405, term155405.getClass(), "lastDataVersion", "gyZHokNAZb");
        setField(term155405, term155405.getClass(), "compatibleCmVersion", "BDiGllEiZb");
        setField(term155405, term155405.getClass(), "lastPlayDate", "EmYykcYSYU");
        setIntField(term155405, term155405.getClass(), "lastPlaceId", -776758828);
        setField(term155405, term155405.getClass(), "lastPlaceName", "tmkiHdXIso");
        setIntField(term155405, term155405.getClass(), "lastRegionId", -1084450309);
        setField(term155405, term155405.getClass(), "lastRegionName", "iivsdaIdLe");
        setIntField(term155405, term155405.getClass(), "lastAllNetId", -701546274);
        setField(term155405, term155405.getClass(), "lastClientId", "yNZErAgZDk");
        setIntField(term155405, term155405.getClass(), "lastUsedDeckId", -875355024);
        setIntField(term155405, term155405.getClass(), "lastPlayMusicLevel", -741514277);
        setIntField(term155405, term155405.getClass(), "lastEmoneyBrand", 1849014808);
        setField(term155403, term155403.getClass(), "user", term155405);
        setIntField(term155403, term155403.getClass(), "chapterId", 452254325);
        setIntField(term155403, term155403.getClass(), "tradeItemId", 68487577);
        setIntField(term155403, term155403.getClass(), "tradeCount", 225702811);
        term155671 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserTradeItem");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term155671;
        callMethod(klass, "equals", argTypes, term155403, args);
    }

};


