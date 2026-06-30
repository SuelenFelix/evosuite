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

public class UserEventPoint_setEventId_10581492278 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term385390;
     Object term385658;

    public UserEventPoint_setEventId_10581492278() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term385396 = new Long(2599553846982918627L);
        term385390 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserEventPoint"));
        Object term385392 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term385394 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term385410 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term385411 = newInstance(Class.forName("java.time.LocalDate"));
        Object term385415 = newInstance(Class.forName("java.time.LocalTime"));
        Object term385420 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term385421 = newInstance(Class.forName("java.time.LocalDate"));
        Object term385425 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term385390, term385390.getClass(), "id", 1385416842691684527L);
        setLongField(term385392, term385392.getClass(), "id", 4471041394485904718L);
        setLongField(term385394, term385394.getClass(), "id", 2271691865956871045L);
        setField(term385394, term385394.getClass(), "extId", term385396);
        setField(term385394, term385394.getClass(), "luid", "bYpyqoLjXR");
        setIntField(term385411, term385411.getClass(), "year", 2012);
        setShortField(term385411, term385411.getClass(), "month", (short) 8);
        setShortField(term385411, term385411.getClass(), "day", (short) 12);
        setField(term385410, term385410.getClass(), "date", term385411);
        setByteField(term385415, term385415.getClass(), "hour", (byte) 2);
        setByteField(term385415, term385415.getClass(), "minute", (byte) 13);
        setByteField(term385415, term385415.getClass(), "second", (byte) 15);
        setIntField(term385415, term385415.getClass(), "nano", 969832518);
        setField(term385410, term385410.getClass(), "time", term385415);
        setField(term385394, term385394.getClass(), "registerTime", term385410);
        setIntField(term385421, term385421.getClass(), "year", 2011);
        setShortField(term385421, term385421.getClass(), "month", (short) 5);
        setShortField(term385421, term385421.getClass(), "day", (short) 26);
        setField(term385420, term385420.getClass(), "date", term385421);
        setByteField(term385425, term385425.getClass(), "hour", (byte) 7);
        setByteField(term385425, term385425.getClass(), "minute", (byte) 18);
        setByteField(term385425, term385425.getClass(), "second", (byte) 36);
        setIntField(term385425, term385425.getClass(), "nano", 156788573);
        setField(term385420, term385420.getClass(), "time", term385425);
        setField(term385394, term385394.getClass(), "accessTime", term385420);
        setField(term385392, term385392.getClass(), "card", term385394);
        setField(term385392, term385392.getClass(), "userName", "VEuNFAjfcH");
        setIntField(term385392, term385392.getClass(), "level", 1272042407);
        setIntField(term385392, term385392.getClass(), "reincarnationNum", -1150694103);
        setLongField(term385392, term385392.getClass(), "exp", 9118307099946457320L);
        setLongField(term385392, term385392.getClass(), "point", 6501555189604356320L);
        setLongField(term385392, term385392.getClass(), "totalPoint", -7147468112060388143L);
        setIntField(term385392, term385392.getClass(), "playCount", 687074376);
        setIntField(term385392, term385392.getClass(), "jewelCount", 1575219530);
        setIntField(term385392, term385392.getClass(), "totalJewelCount", 166630202);
        setIntField(term385392, term385392.getClass(), "medalCount", -1849073127);
        setIntField(term385392, term385392.getClass(), "playerRating", -632568846);
        setIntField(term385392, term385392.getClass(), "highestRating", -41704478);
        setIntField(term385392, term385392.getClass(), "battlePoint", 1411166222);
        setIntField(term385392, term385392.getClass(), "bestBattlePoint", 1124246517);
        setIntField(term385392, term385392.getClass(), "overDamageBattlePoint", -2096970079);
        setBooleanField(term385392, term385392.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term385392, term385392.getClass(), "nameplateId", -228525860);
        setIntField(term385392, term385392.getClass(), "trophyId", -483867212);
        setIntField(term385392, term385392.getClass(), "cardId", 1846574965);
        setIntField(term385392, term385392.getClass(), "characterId", 477488093);
        setIntField(term385392, term385392.getClass(), "characterVoiceNo", 1786097839);
        setIntField(term385392, term385392.getClass(), "tabSetting", -1276783077);
        setIntField(term385392, term385392.getClass(), "tabSortSetting", -1023204110);
        setIntField(term385392, term385392.getClass(), "cardCategorySetting", 1861858901);
        setIntField(term385392, term385392.getClass(), "cardSortSetting", 663786874);
        setIntField(term385392, term385392.getClass(), "rivalScoreCategorySetting", -813455053);
        setIntField(term385392, term385392.getClass(), "playedTutorialBit", 1290017080);
        setIntField(term385392, term385392.getClass(), "firstTutorialCancelNum", -897309148);
        setLongField(term385392, term385392.getClass(), "sumTechHighScore", 921723597155040429L);
        setLongField(term385392, term385392.getClass(), "sumTechBasicHighScore", 2908387687280830792L);
        setLongField(term385392, term385392.getClass(), "sumTechAdvancedHighScore", 3525453781498178592L);
        setLongField(term385392, term385392.getClass(), "sumTechExpertHighScore", 4254974403802561664L);
        setLongField(term385392, term385392.getClass(), "sumTechMasterHighScore", 3843457853749581853L);
        setLongField(term385392, term385392.getClass(), "sumTechLunaticHighScore", 6630961918885092773L);
        setLongField(term385392, term385392.getClass(), "sumBattleHighScore", -8674446211671041575L);
        setLongField(term385392, term385392.getClass(), "sumBattleBasicHighScore", -7001227643230274527L);
        setLongField(term385392, term385392.getClass(), "sumBattleAdvancedHighScore", 1975641782211851713L);
        setLongField(term385392, term385392.getClass(), "sumBattleExpertHighScore", -8565871879430234342L);
        setLongField(term385392, term385392.getClass(), "sumBattleMasterHighScore", -9014663594065661798L);
        setLongField(term385392, term385392.getClass(), "sumBattleLunaticHighScore", 4146815268646664511L);
        setField(term385392, term385392.getClass(), "eventWatchedDate", "OWetkAcWNc");
        setField(term385392, term385392.getClass(), "cmEventWatchedDate", "TeyncNfcLb");
        setField(term385392, term385392.getClass(), "firstGameId", "FgRCLtwEML");
        setField(term385392, term385392.getClass(), "firstRomVersion", "ORfkYGHwBQ");
        setField(term385392, term385392.getClass(), "firstDataVersion", "UFuoaFySBU");
        setField(term385392, term385392.getClass(), "firstPlayDate", "gaWKdvKhkF");
        setField(term385392, term385392.getClass(), "lastGameId", "NwALvmSQHC");
        setField(term385392, term385392.getClass(), "lastRomVersion", "zyMBNIVfaq");
        setField(term385392, term385392.getClass(), "lastDataVersion", "gTDIjdogTK");
        setField(term385392, term385392.getClass(), "compatibleCmVersion", "nRHyndZPSL");
        setField(term385392, term385392.getClass(), "lastPlayDate", "cezyPzcyhX");
        setIntField(term385392, term385392.getClass(), "lastPlaceId", 369666543);
        setField(term385392, term385392.getClass(), "lastPlaceName", "gjHeaRCrmk");
        setIntField(term385392, term385392.getClass(), "lastRegionId", 1392050898);
        setField(term385392, term385392.getClass(), "lastRegionName", "SvTlgNarjR");
        setIntField(term385392, term385392.getClass(), "lastAllNetId", 1820983201);
        setField(term385392, term385392.getClass(), "lastClientId", "djDAtDqgLt");
        setIntField(term385392, term385392.getClass(), "lastUsedDeckId", -1126732971);
        setIntField(term385392, term385392.getClass(), "lastPlayMusicLevel", 1258279823);
        setIntField(term385392, term385392.getClass(), "lastEmoneyBrand", -1774136613);
        setField(term385390, term385390.getClass(), "user", term385392);
        setIntField(term385390, term385390.getClass(), "eventId", 538341726);
        setLongField(term385390, term385390.getClass(), "point", -4574549740114013463L);
        setBooleanField(term385390, term385390.getClass(), "isRankingRewarded", false);
        term385658 = new Integer(-352570199);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserEventPoint");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term385658;
        callMethod(klass, "setEventId", argTypes, term385390, args);
    }

};


