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

public class UserTechEvent_setTotalPlatinumScore_137538716413 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term357423;
     Object term357705;

    public UserTechEvent_setTotalPlatinumScore_137538716413() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term357429 = new Long(7393438062788805516L);
        term357423 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserTechEvent"));
        Object term357425 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term357427 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term357443 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term357444 = newInstance(Class.forName("java.time.LocalDate"));
        Object term357448 = newInstance(Class.forName("java.time.LocalTime"));
        Object term357453 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term357454 = newInstance(Class.forName("java.time.LocalDate"));
        Object term357458 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term357423, term357423.getClass(), "id", 5765743722641326619L);
        setLongField(term357425, term357425.getClass(), "id", -7388356891096097651L);
        setLongField(term357427, term357427.getClass(), "id", 6535447939486377844L);
        setField(term357427, term357427.getClass(), "extId", term357429);
        setField(term357427, term357427.getClass(), "luid", "GSDNcmjnrW");
        setIntField(term357444, term357444.getClass(), "year", 2023);
        setShortField(term357444, term357444.getClass(), "month", (short) 8);
        setShortField(term357444, term357444.getClass(), "day", (short) 6);
        setField(term357443, term357443.getClass(), "date", term357444);
        setByteField(term357448, term357448.getClass(), "hour", (byte) 14);
        setByteField(term357448, term357448.getClass(), "minute", (byte) 47);
        setByteField(term357448, term357448.getClass(), "second", (byte) 25);
        setIntField(term357448, term357448.getClass(), "nano", 351418783);
        setField(term357443, term357443.getClass(), "time", term357448);
        setField(term357427, term357427.getClass(), "registerTime", term357443);
        setIntField(term357454, term357454.getClass(), "year", 2022);
        setShortField(term357454, term357454.getClass(), "month", (short) 10);
        setShortField(term357454, term357454.getClass(), "day", (short) 26);
        setField(term357453, term357453.getClass(), "date", term357454);
        setByteField(term357458, term357458.getClass(), "hour", (byte) 13);
        setByteField(term357458, term357458.getClass(), "minute", (byte) 54);
        setByteField(term357458, term357458.getClass(), "second", (byte) 46);
        setIntField(term357458, term357458.getClass(), "nano", 30247781);
        setField(term357453, term357453.getClass(), "time", term357458);
        setField(term357427, term357427.getClass(), "accessTime", term357453);
        setField(term357425, term357425.getClass(), "card", term357427);
        setField(term357425, term357425.getClass(), "userName", "tMGOlywCNF");
        setIntField(term357425, term357425.getClass(), "level", -1174287174);
        setIntField(term357425, term357425.getClass(), "reincarnationNum", 977657456);
        setLongField(term357425, term357425.getClass(), "exp", -5060660288049546597L);
        setLongField(term357425, term357425.getClass(), "point", -7911376141071577194L);
        setLongField(term357425, term357425.getClass(), "totalPoint", 4534962344486417675L);
        setIntField(term357425, term357425.getClass(), "playCount", 1619989783);
        setIntField(term357425, term357425.getClass(), "jewelCount", 285825906);
        setIntField(term357425, term357425.getClass(), "totalJewelCount", -404593381);
        setIntField(term357425, term357425.getClass(), "medalCount", -704467946);
        setIntField(term357425, term357425.getClass(), "playerRating", -269067363);
        setIntField(term357425, term357425.getClass(), "highestRating", 1101416437);
        setIntField(term357425, term357425.getClass(), "battlePoint", 1051571659);
        setIntField(term357425, term357425.getClass(), "bestBattlePoint", -549412635);
        setIntField(term357425, term357425.getClass(), "overDamageBattlePoint", 997885957);
        setBooleanField(term357425, term357425.getClass(), "isDialogWatchedSuggestMemory", true);
        setIntField(term357425, term357425.getClass(), "nameplateId", -18681);
        setIntField(term357425, term357425.getClass(), "trophyId", -1814487298);
        setIntField(term357425, term357425.getClass(), "cardId", 786780212);
        setIntField(term357425, term357425.getClass(), "characterId", -2129815769);
        setIntField(term357425, term357425.getClass(), "characterVoiceNo", 317062196);
        setIntField(term357425, term357425.getClass(), "tabSetting", 1312635827);
        setIntField(term357425, term357425.getClass(), "tabSortSetting", 1623716197);
        setIntField(term357425, term357425.getClass(), "cardCategorySetting", 1977127862);
        setIntField(term357425, term357425.getClass(), "cardSortSetting", 1602623931);
        setIntField(term357425, term357425.getClass(), "rivalScoreCategorySetting", -1530266839);
        setIntField(term357425, term357425.getClass(), "playedTutorialBit", 1680764485);
        setIntField(term357425, term357425.getClass(), "firstTutorialCancelNum", 580423385);
        setLongField(term357425, term357425.getClass(), "sumTechHighScore", -5700648551553345695L);
        setLongField(term357425, term357425.getClass(), "sumTechBasicHighScore", 4301012568418408499L);
        setLongField(term357425, term357425.getClass(), "sumTechAdvancedHighScore", -1919225561592508355L);
        setLongField(term357425, term357425.getClass(), "sumTechExpertHighScore", 3920388028358140825L);
        setLongField(term357425, term357425.getClass(), "sumTechMasterHighScore", -8606435253831215486L);
        setLongField(term357425, term357425.getClass(), "sumTechLunaticHighScore", -223718437703917314L);
        setLongField(term357425, term357425.getClass(), "sumBattleHighScore", 470796961368222234L);
        setLongField(term357425, term357425.getClass(), "sumBattleBasicHighScore", -1774388185025943649L);
        setLongField(term357425, term357425.getClass(), "sumBattleAdvancedHighScore", 7898874053815004517L);
        setLongField(term357425, term357425.getClass(), "sumBattleExpertHighScore", 864053477658824630L);
        setLongField(term357425, term357425.getClass(), "sumBattleMasterHighScore", 7157323015578725980L);
        setLongField(term357425, term357425.getClass(), "sumBattleLunaticHighScore", -2397899349266539962L);
        setField(term357425, term357425.getClass(), "eventWatchedDate", "VGKRiEyTvE");
        setField(term357425, term357425.getClass(), "cmEventWatchedDate", "IhcEHpXkob");
        setField(term357425, term357425.getClass(), "firstGameId", "ioEDElbWJy");
        setField(term357425, term357425.getClass(), "firstRomVersion", "EOTzpwdFZX");
        setField(term357425, term357425.getClass(), "firstDataVersion", "ruVLkwVHZZ");
        setField(term357425, term357425.getClass(), "firstPlayDate", "OKqVtEfDVA");
        setField(term357425, term357425.getClass(), "lastGameId", "hPyWXVCDwD");
        setField(term357425, term357425.getClass(), "lastRomVersion", "xSKFiqFisC");
        setField(term357425, term357425.getClass(), "lastDataVersion", "vsXOcxpXzo");
        setField(term357425, term357425.getClass(), "compatibleCmVersion", "BKsrnxcvwO");
        setField(term357425, term357425.getClass(), "lastPlayDate", "bWJuYqVbYa");
        setIntField(term357425, term357425.getClass(), "lastPlaceId", -993751148);
        setField(term357425, term357425.getClass(), "lastPlaceName", "RvgGcARkbA");
        setIntField(term357425, term357425.getClass(), "lastRegionId", -371303023);
        setField(term357425, term357425.getClass(), "lastRegionName", "seVCegEoTl");
        setIntField(term357425, term357425.getClass(), "lastAllNetId", 1906471864);
        setField(term357425, term357425.getClass(), "lastClientId", "FUWbCKQMTT");
        setIntField(term357425, term357425.getClass(), "lastUsedDeckId", -1954935302);
        setIntField(term357425, term357425.getClass(), "lastPlayMusicLevel", -809003340);
        setIntField(term357425, term357425.getClass(), "lastEmoneyBrand", 907200516);
        setField(term357423, term357423.getClass(), "user", term357425);
        setIntField(term357423, term357423.getClass(), "eventId", -2022414187);
        setIntField(term357423, term357423.getClass(), "totalTechScore", -1344470563);
        setIntField(term357423, term357423.getClass(), "totalPlatinumScore", -791458673);
        setField(term357423, term357423.getClass(), "techRecordDate", "bUDliGBfQm");
        setBooleanField(term357423, term357423.getClass(), "isRankingRewarded", true);
        setBooleanField(term357423, term357423.getClass(), "isTotalTechNewRecord", false);
        term357705 = new Integer(-1363139657);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserTechEvent");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term357705;
        callMethod(klass, "setTotalPlatinumScore", argTypes, term357423, args);
    }

};


