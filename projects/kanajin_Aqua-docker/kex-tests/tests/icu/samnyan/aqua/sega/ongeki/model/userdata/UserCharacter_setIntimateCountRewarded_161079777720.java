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

public class UserCharacter_setIntimateCountRewarded_161079777720 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term177246;
     Object term177531;

    public UserCharacter_setIntimateCountRewarded_161079777720() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term177252 = new Long(-5534222035915952617L);
        term177246 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserCharacter"));
        Object term177248 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term177250 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term177266 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term177267 = newInstance(Class.forName("java.time.LocalDate"));
        Object term177271 = newInstance(Class.forName("java.time.LocalTime"));
        Object term177276 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term177277 = newInstance(Class.forName("java.time.LocalDate"));
        Object term177281 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term177246, term177246.getClass(), "id", -3691842816362174972L);
        setLongField(term177248, term177248.getClass(), "id", 5875644536140988550L);
        setLongField(term177250, term177250.getClass(), "id", -7616963718648168070L);
        setField(term177250, term177250.getClass(), "extId", term177252);
        setField(term177250, term177250.getClass(), "luid", "zRpqQnOFBI");
        setIntField(term177267, term177267.getClass(), "year", 2023);
        setShortField(term177267, term177267.getClass(), "month", (short) 12);
        setShortField(term177267, term177267.getClass(), "day", (short) 5);
        setField(term177266, term177266.getClass(), "date", term177267);
        setByteField(term177271, term177271.getClass(), "hour", (byte) 19);
        setByteField(term177271, term177271.getClass(), "minute", (byte) 19);
        setByteField(term177271, term177271.getClass(), "second", (byte) 47);
        setIntField(term177271, term177271.getClass(), "nano", 871420313);
        setField(term177266, term177266.getClass(), "time", term177271);
        setField(term177250, term177250.getClass(), "registerTime", term177266);
        setIntField(term177277, term177277.getClass(), "year", 2029);
        setShortField(term177277, term177277.getClass(), "month", (short) 1);
        setShortField(term177277, term177277.getClass(), "day", (short) 20);
        setField(term177276, term177276.getClass(), "date", term177277);
        setByteField(term177281, term177281.getClass(), "hour", (byte) 0);
        setByteField(term177281, term177281.getClass(), "minute", (byte) 45);
        setByteField(term177281, term177281.getClass(), "second", (byte) 30);
        setIntField(term177281, term177281.getClass(), "nano", 207682029);
        setField(term177276, term177276.getClass(), "time", term177281);
        setField(term177250, term177250.getClass(), "accessTime", term177276);
        setField(term177248, term177248.getClass(), "card", term177250);
        setField(term177248, term177248.getClass(), "userName", "HqBUcvufgR");
        setIntField(term177248, term177248.getClass(), "level", -571015375);
        setIntField(term177248, term177248.getClass(), "reincarnationNum", -1932607282);
        setLongField(term177248, term177248.getClass(), "exp", 7513193376333191949L);
        setLongField(term177248, term177248.getClass(), "point", 4190534065690990308L);
        setLongField(term177248, term177248.getClass(), "totalPoint", 5269765578770913317L);
        setIntField(term177248, term177248.getClass(), "playCount", 960249702);
        setIntField(term177248, term177248.getClass(), "jewelCount", 1578244544);
        setIntField(term177248, term177248.getClass(), "totalJewelCount", 302433460);
        setIntField(term177248, term177248.getClass(), "medalCount", 1057744472);
        setIntField(term177248, term177248.getClass(), "playerRating", -374607997);
        setIntField(term177248, term177248.getClass(), "highestRating", 1319218321);
        setIntField(term177248, term177248.getClass(), "battlePoint", 888577209);
        setIntField(term177248, term177248.getClass(), "bestBattlePoint", 2135004050);
        setIntField(term177248, term177248.getClass(), "overDamageBattlePoint", -1451096117);
        setBooleanField(term177248, term177248.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term177248, term177248.getClass(), "nameplateId", -1964170899);
        setIntField(term177248, term177248.getClass(), "trophyId", 658593960);
        setIntField(term177248, term177248.getClass(), "cardId", -1492746094);
        setIntField(term177248, term177248.getClass(), "characterId", -1561330173);
        setIntField(term177248, term177248.getClass(), "characterVoiceNo", -829139246);
        setIntField(term177248, term177248.getClass(), "tabSetting", -1898349638);
        setIntField(term177248, term177248.getClass(), "tabSortSetting", -1841869267);
        setIntField(term177248, term177248.getClass(), "cardCategorySetting", 300502643);
        setIntField(term177248, term177248.getClass(), "cardSortSetting", 189992900);
        setIntField(term177248, term177248.getClass(), "rivalScoreCategorySetting", 1073692841);
        setIntField(term177248, term177248.getClass(), "playedTutorialBit", -450450534);
        setIntField(term177248, term177248.getClass(), "firstTutorialCancelNum", 1403312822);
        setLongField(term177248, term177248.getClass(), "sumTechHighScore", 7345544463513017748L);
        setLongField(term177248, term177248.getClass(), "sumTechBasicHighScore", 3719699734794738508L);
        setLongField(term177248, term177248.getClass(), "sumTechAdvancedHighScore", -4703905308104862314L);
        setLongField(term177248, term177248.getClass(), "sumTechExpertHighScore", 33430713669591782L);
        setLongField(term177248, term177248.getClass(), "sumTechMasterHighScore", 7155943267569250580L);
        setLongField(term177248, term177248.getClass(), "sumTechLunaticHighScore", -2995857644224632258L);
        setLongField(term177248, term177248.getClass(), "sumBattleHighScore", -3931041430901886981L);
        setLongField(term177248, term177248.getClass(), "sumBattleBasicHighScore", -5052135911483840566L);
        setLongField(term177248, term177248.getClass(), "sumBattleAdvancedHighScore", 7782854995772117469L);
        setLongField(term177248, term177248.getClass(), "sumBattleExpertHighScore", -4482026236867875918L);
        setLongField(term177248, term177248.getClass(), "sumBattleMasterHighScore", 3980744608339083800L);
        setLongField(term177248, term177248.getClass(), "sumBattleLunaticHighScore", -5514455953680227693L);
        setField(term177248, term177248.getClass(), "eventWatchedDate", "UTSqUDNbRo");
        setField(term177248, term177248.getClass(), "cmEventWatchedDate", "oOEVZNBuPz");
        setField(term177248, term177248.getClass(), "firstGameId", "ONFMHsmNXv");
        setField(term177248, term177248.getClass(), "firstRomVersion", "cCGTfMQirP");
        setField(term177248, term177248.getClass(), "firstDataVersion", "rZkZxvNGiH");
        setField(term177248, term177248.getClass(), "firstPlayDate", "syxxjJZgxt");
        setField(term177248, term177248.getClass(), "lastGameId", "qsDbGHhiYJ");
        setField(term177248, term177248.getClass(), "lastRomVersion", "xMHAXQoTQL");
        setField(term177248, term177248.getClass(), "lastDataVersion", "ODVzituXwb");
        setField(term177248, term177248.getClass(), "compatibleCmVersion", "FsRdBvMoFL");
        setField(term177248, term177248.getClass(), "lastPlayDate", "LxfyyptgQV");
        setIntField(term177248, term177248.getClass(), "lastPlaceId", -2118595564);
        setField(term177248, term177248.getClass(), "lastPlaceName", "HSSChGSfwI");
        setIntField(term177248, term177248.getClass(), "lastRegionId", 1183106727);
        setField(term177248, term177248.getClass(), "lastRegionName", "wqSCneTuDZ");
        setIntField(term177248, term177248.getClass(), "lastAllNetId", 1207415380);
        setField(term177248, term177248.getClass(), "lastClientId", "IAfjCTUPiV");
        setIntField(term177248, term177248.getClass(), "lastUsedDeckId", -925572654);
        setIntField(term177248, term177248.getClass(), "lastPlayMusicLevel", 1716478180);
        setIntField(term177248, term177248.getClass(), "lastEmoneyBrand", -168584816);
        setField(term177246, term177246.getClass(), "user", term177248);
        setIntField(term177246, term177246.getClass(), "characterId", -1494770619);
        setIntField(term177246, term177246.getClass(), "costumeId", -1881283192);
        setIntField(term177246, term177246.getClass(), "attachmentId", -1099688599);
        setIntField(term177246, term177246.getClass(), "playCount", 2122713442);
        setIntField(term177246, term177246.getClass(), "intimateLevel", -604358624);
        setIntField(term177246, term177246.getClass(), "intimateCount", -1207562004);
        setIntField(term177246, term177246.getClass(), "intimateCountRewarded", -1440790542);
        setField(term177246, term177246.getClass(), "intimateCountDate", "BmwytjiuDw");
        setBooleanField(term177246, term177246.getClass(), "isNew", true);
        term177531 = new Integer(1293550828);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserCharacter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term177531;
        callMethod(klass, "setIntimateCountRewarded", argTypes, term177246, args);
    }

};


