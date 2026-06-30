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

public class UserEventMusic_isTechNewRecord_116278544210 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term373564;

    public UserEventMusic_isTechNewRecord_116278544210() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term373570 = new Long(7495572757420909707L);
        term373564 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserEventMusic"));
        Object term373566 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term373568 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term373584 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term373585 = newInstance(Class.forName("java.time.LocalDate"));
        Object term373589 = newInstance(Class.forName("java.time.LocalTime"));
        Object term373594 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term373595 = newInstance(Class.forName("java.time.LocalDate"));
        Object term373599 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term373564, term373564.getClass(), "id", 1717873989822420719L);
        setLongField(term373566, term373566.getClass(), "id", -2184469101348168332L);
        setLongField(term373568, term373568.getClass(), "id", -1909953632926507053L);
        setField(term373568, term373568.getClass(), "extId", term373570);
        setField(term373568, term373568.getClass(), "luid", "NVWYkZczqy");
        setIntField(term373585, term373585.getClass(), "year", 2018);
        setShortField(term373585, term373585.getClass(), "month", (short) 11);
        setShortField(term373585, term373585.getClass(), "day", (short) 9);
        setField(term373584, term373584.getClass(), "date", term373585);
        setByteField(term373589, term373589.getClass(), "hour", (byte) 9);
        setByteField(term373589, term373589.getClass(), "minute", (byte) 14);
        setByteField(term373589, term373589.getClass(), "second", (byte) 40);
        setIntField(term373589, term373589.getClass(), "nano", 836017823);
        setField(term373584, term373584.getClass(), "time", term373589);
        setField(term373568, term373568.getClass(), "registerTime", term373584);
        setIntField(term373595, term373595.getClass(), "year", 2023);
        setShortField(term373595, term373595.getClass(), "month", (short) 3);
        setShortField(term373595, term373595.getClass(), "day", (short) 4);
        setField(term373594, term373594.getClass(), "date", term373595);
        setByteField(term373599, term373599.getClass(), "hour", (byte) 11);
        setByteField(term373599, term373599.getClass(), "minute", (byte) 54);
        setByteField(term373599, term373599.getClass(), "second", (byte) 37);
        setIntField(term373599, term373599.getClass(), "nano", 114580747);
        setField(term373594, term373594.getClass(), "time", term373599);
        setField(term373568, term373568.getClass(), "accessTime", term373594);
        setField(term373566, term373566.getClass(), "card", term373568);
        setField(term373566, term373566.getClass(), "userName", "wJMPOtkOhd");
        setIntField(term373566, term373566.getClass(), "level", -1675890025);
        setIntField(term373566, term373566.getClass(), "reincarnationNum", -258486754);
        setLongField(term373566, term373566.getClass(), "exp", -5863165646279916294L);
        setLongField(term373566, term373566.getClass(), "point", -2454307945128972987L);
        setLongField(term373566, term373566.getClass(), "totalPoint", -868943184886370644L);
        setIntField(term373566, term373566.getClass(), "playCount", 1784913502);
        setIntField(term373566, term373566.getClass(), "jewelCount", -1872909295);
        setIntField(term373566, term373566.getClass(), "totalJewelCount", 2048858086);
        setIntField(term373566, term373566.getClass(), "medalCount", -161098430);
        setIntField(term373566, term373566.getClass(), "playerRating", -1951266375);
        setIntField(term373566, term373566.getClass(), "highestRating", 1217776357);
        setIntField(term373566, term373566.getClass(), "battlePoint", 370963651);
        setIntField(term373566, term373566.getClass(), "bestBattlePoint", 743926362);
        setIntField(term373566, term373566.getClass(), "overDamageBattlePoint", 42808417);
        setBooleanField(term373566, term373566.getClass(), "isDialogWatchedSuggestMemory", true);
        setIntField(term373566, term373566.getClass(), "nameplateId", 1739701826);
        setIntField(term373566, term373566.getClass(), "trophyId", -152138811);
        setIntField(term373566, term373566.getClass(), "cardId", 1325226534);
        setIntField(term373566, term373566.getClass(), "characterId", -264360829);
        setIntField(term373566, term373566.getClass(), "characterVoiceNo", -1087469344);
        setIntField(term373566, term373566.getClass(), "tabSetting", -67805368);
        setIntField(term373566, term373566.getClass(), "tabSortSetting", 1479439919);
        setIntField(term373566, term373566.getClass(), "cardCategorySetting", -985337075);
        setIntField(term373566, term373566.getClass(), "cardSortSetting", -1769408999);
        setIntField(term373566, term373566.getClass(), "rivalScoreCategorySetting", -103930820);
        setIntField(term373566, term373566.getClass(), "playedTutorialBit", -145149685);
        setIntField(term373566, term373566.getClass(), "firstTutorialCancelNum", -718463835);
        setLongField(term373566, term373566.getClass(), "sumTechHighScore", 6713945780354346110L);
        setLongField(term373566, term373566.getClass(), "sumTechBasicHighScore", 5890655995565500310L);
        setLongField(term373566, term373566.getClass(), "sumTechAdvancedHighScore", -8742391581174140369L);
        setLongField(term373566, term373566.getClass(), "sumTechExpertHighScore", -4572171145122035004L);
        setLongField(term373566, term373566.getClass(), "sumTechMasterHighScore", 1465829348087288737L);
        setLongField(term373566, term373566.getClass(), "sumTechLunaticHighScore", 3652692123377023240L);
        setLongField(term373566, term373566.getClass(), "sumBattleHighScore", 6588233714808532510L);
        setLongField(term373566, term373566.getClass(), "sumBattleBasicHighScore", -3256451316835088134L);
        setLongField(term373566, term373566.getClass(), "sumBattleAdvancedHighScore", 3748579065736036495L);
        setLongField(term373566, term373566.getClass(), "sumBattleExpertHighScore", -637879730321231040L);
        setLongField(term373566, term373566.getClass(), "sumBattleMasterHighScore", 6322496346589854566L);
        setLongField(term373566, term373566.getClass(), "sumBattleLunaticHighScore", -294475609126650097L);
        setField(term373566, term373566.getClass(), "eventWatchedDate", "KJuARIAKdI");
        setField(term373566, term373566.getClass(), "cmEventWatchedDate", "VEskEICAbE");
        setField(term373566, term373566.getClass(), "firstGameId", "SCPDqOiMOH");
        setField(term373566, term373566.getClass(), "firstRomVersion", "ZsOhwsLqsz");
        setField(term373566, term373566.getClass(), "firstDataVersion", "QvvuikDCBY");
        setField(term373566, term373566.getClass(), "firstPlayDate", "lUGEEUfnbz");
        setField(term373566, term373566.getClass(), "lastGameId", "VXgiKvMoSE");
        setField(term373566, term373566.getClass(), "lastRomVersion", "DNozFODZvK");
        setField(term373566, term373566.getClass(), "lastDataVersion", "KOXamjIQuv");
        setField(term373566, term373566.getClass(), "compatibleCmVersion", "tJhtGgdRFR");
        setField(term373566, term373566.getClass(), "lastPlayDate", "jyMMsjYUTG");
        setIntField(term373566, term373566.getClass(), "lastPlaceId", -1638835760);
        setField(term373566, term373566.getClass(), "lastPlaceName", "AvIoUKtZBL");
        setIntField(term373566, term373566.getClass(), "lastRegionId", -1772958151);
        setField(term373566, term373566.getClass(), "lastRegionName", "YIwjuHHTbl");
        setIntField(term373566, term373566.getClass(), "lastAllNetId", 1335638751);
        setField(term373566, term373566.getClass(), "lastClientId", "gzugwoEXDr");
        setIntField(term373566, term373566.getClass(), "lastUsedDeckId", 626462172);
        setIntField(term373566, term373566.getClass(), "lastPlayMusicLevel", 1608575630);
        setIntField(term373566, term373566.getClass(), "lastEmoneyBrand", 419285205);
        setField(term373564, term373564.getClass(), "user", term373566);
        setIntField(term373564, term373564.getClass(), "eventId", -64101852);
        setIntField(term373564, term373564.getClass(), "type", 1520191139);
        setIntField(term373564, term373564.getClass(), "musicId", 789060077);
        setIntField(term373564, term373564.getClass(), "level", 700412474);
        setIntField(term373564, term373564.getClass(), "techScoreMax", 1976712366);
        setIntField(term373564, term373564.getClass(), "platinumScoreMax", 1562931453);
        setField(term373564, term373564.getClass(), "techRecordDate", "CIWbgYSuZU");
        setBooleanField(term373564, term373564.getClass(), "isTechNewRecord", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserEventMusic");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isTechNewRecord", argTypes, term373564, args);
    }

};


