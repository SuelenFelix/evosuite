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

public class UserCard_setSkillId_212421896831 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term128690;
     Object term129035;

    public UserCard_setSkillId_212421896831() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term128696 = new Long(-5242567610844514867L);
        term128690 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserCard"));
        Object term128692 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term128694 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term128710 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term128711 = newInstance(Class.forName("java.time.LocalDate"));
        Object term128715 = newInstance(Class.forName("java.time.LocalTime"));
        Object term128720 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term128721 = newInstance(Class.forName("java.time.LocalDate"));
        Object term128725 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term128690, term128690.getClass(), "id", -1246408628373508012L);
        setLongField(term128692, term128692.getClass(), "id", -6478745274246057222L);
        setLongField(term128694, term128694.getClass(), "id", 3163262868554272785L);
        setField(term128694, term128694.getClass(), "extId", term128696);
        setField(term128694, term128694.getClass(), "luid", "mfxNrcSOVD");
        setIntField(term128711, term128711.getClass(), "year", 2013);
        setShortField(term128711, term128711.getClass(), "month", (short) 8);
        setShortField(term128711, term128711.getClass(), "day", (short) 30);
        setField(term128710, term128710.getClass(), "date", term128711);
        setByteField(term128715, term128715.getClass(), "hour", (byte) 23);
        setByteField(term128715, term128715.getClass(), "minute", (byte) 18);
        setByteField(term128715, term128715.getClass(), "second", (byte) 55);
        setIntField(term128715, term128715.getClass(), "nano", 174457563);
        setField(term128710, term128710.getClass(), "time", term128715);
        setField(term128694, term128694.getClass(), "registerTime", term128710);
        setIntField(term128721, term128721.getClass(), "year", 2025);
        setShortField(term128721, term128721.getClass(), "month", (short) 12);
        setShortField(term128721, term128721.getClass(), "day", (short) 30);
        setField(term128720, term128720.getClass(), "date", term128721);
        setByteField(term128725, term128725.getClass(), "hour", (byte) 16);
        setByteField(term128725, term128725.getClass(), "minute", (byte) 48);
        setByteField(term128725, term128725.getClass(), "second", (byte) 54);
        setIntField(term128725, term128725.getClass(), "nano", 288599555);
        setField(term128720, term128720.getClass(), "time", term128725);
        setField(term128694, term128694.getClass(), "accessTime", term128720);
        setField(term128692, term128692.getClass(), "card", term128694);
        setField(term128692, term128692.getClass(), "userName", "jrsTEswExz");
        setIntField(term128692, term128692.getClass(), "level", -2092805936);
        setIntField(term128692, term128692.getClass(), "reincarnationNum", -1286454716);
        setLongField(term128692, term128692.getClass(), "exp", -2863346279002051597L);
        setLongField(term128692, term128692.getClass(), "point", 8484845463796458489L);
        setLongField(term128692, term128692.getClass(), "totalPoint", 6844090800515537410L);
        setIntField(term128692, term128692.getClass(), "playCount", -1514697210);
        setIntField(term128692, term128692.getClass(), "jewelCount", -1991261137);
        setIntField(term128692, term128692.getClass(), "totalJewelCount", 353940151);
        setIntField(term128692, term128692.getClass(), "medalCount", 1335341338);
        setIntField(term128692, term128692.getClass(), "playerRating", 1933669224);
        setIntField(term128692, term128692.getClass(), "highestRating", -455605328);
        setIntField(term128692, term128692.getClass(), "battlePoint", 988952771);
        setIntField(term128692, term128692.getClass(), "bestBattlePoint", 860466584);
        setIntField(term128692, term128692.getClass(), "overDamageBattlePoint", -1230615258);
        setBooleanField(term128692, term128692.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term128692, term128692.getClass(), "nameplateId", -1230485683);
        setIntField(term128692, term128692.getClass(), "trophyId", -341831994);
        setIntField(term128692, term128692.getClass(), "cardId", -190607004);
        setIntField(term128692, term128692.getClass(), "characterId", 1193989353);
        setIntField(term128692, term128692.getClass(), "characterVoiceNo", 701908779);
        setIntField(term128692, term128692.getClass(), "tabSetting", -1681756654);
        setIntField(term128692, term128692.getClass(), "tabSortSetting", -872888112);
        setIntField(term128692, term128692.getClass(), "cardCategorySetting", 893339147);
        setIntField(term128692, term128692.getClass(), "cardSortSetting", 1550463846);
        setIntField(term128692, term128692.getClass(), "rivalScoreCategorySetting", 693808687);
        setIntField(term128692, term128692.getClass(), "playedTutorialBit", -1713920125);
        setIntField(term128692, term128692.getClass(), "firstTutorialCancelNum", -242270358);
        setLongField(term128692, term128692.getClass(), "sumTechHighScore", -1624923670031801093L);
        setLongField(term128692, term128692.getClass(), "sumTechBasicHighScore", 569733731026445703L);
        setLongField(term128692, term128692.getClass(), "sumTechAdvancedHighScore", 3266559929139394086L);
        setLongField(term128692, term128692.getClass(), "sumTechExpertHighScore", -2010921040891117409L);
        setLongField(term128692, term128692.getClass(), "sumTechMasterHighScore", -8298120273216209299L);
        setLongField(term128692, term128692.getClass(), "sumTechLunaticHighScore", -4382708033180016508L);
        setLongField(term128692, term128692.getClass(), "sumBattleHighScore", 3847813637209840298L);
        setLongField(term128692, term128692.getClass(), "sumBattleBasicHighScore", -1924935306238826190L);
        setLongField(term128692, term128692.getClass(), "sumBattleAdvancedHighScore", 2587802307541052389L);
        setLongField(term128692, term128692.getClass(), "sumBattleExpertHighScore", 3533169544094281550L);
        setLongField(term128692, term128692.getClass(), "sumBattleMasterHighScore", -200593928551791147L);
        setLongField(term128692, term128692.getClass(), "sumBattleLunaticHighScore", -2958525951944477629L);
        setField(term128692, term128692.getClass(), "eventWatchedDate", "ZQJeRspiaW");
        setField(term128692, term128692.getClass(), "cmEventWatchedDate", "ZPHvVTleEx");
        setField(term128692, term128692.getClass(), "firstGameId", "HTaevTdmSx");
        setField(term128692, term128692.getClass(), "firstRomVersion", "fxACzuCTdG");
        setField(term128692, term128692.getClass(), "firstDataVersion", "ZbjykDvTqF");
        setField(term128692, term128692.getClass(), "firstPlayDate", "HmpRVfDNrn");
        setField(term128692, term128692.getClass(), "lastGameId", "PdGPETcyXN");
        setField(term128692, term128692.getClass(), "lastRomVersion", "rWXLyvesHI");
        setField(term128692, term128692.getClass(), "lastDataVersion", "iRfJJNrMLZ");
        setField(term128692, term128692.getClass(), "compatibleCmVersion", "sYrnlJNHsq");
        setField(term128692, term128692.getClass(), "lastPlayDate", "POHTKvZAAU");
        setIntField(term128692, term128692.getClass(), "lastPlaceId", 1299600213);
        setField(term128692, term128692.getClass(), "lastPlaceName", "HSQaALDFNu");
        setIntField(term128692, term128692.getClass(), "lastRegionId", 1067527367);
        setField(term128692, term128692.getClass(), "lastRegionName", "aOaXBQyJal");
        setIntField(term128692, term128692.getClass(), "lastAllNetId", 74605400);
        setField(term128692, term128692.getClass(), "lastClientId", "vRbigVGnNS");
        setIntField(term128692, term128692.getClass(), "lastUsedDeckId", 642608767);
        setIntField(term128692, term128692.getClass(), "lastPlayMusicLevel", 1819464978);
        setIntField(term128692, term128692.getClass(), "lastEmoneyBrand", -1556266779);
        setField(term128690, term128690.getClass(), "user", term128692);
        setIntField(term128690, term128690.getClass(), "cardId", -1);
        setIntField(term128690, term128690.getClass(), "digitalStock", 1);
        setIntField(term128690, term128690.getClass(), "analogStock", 2078431621);
        setIntField(term128690, term128690.getClass(), "level", -316254290);
        setIntField(term128690, term128690.getClass(), "maxLevel", 10);
        setIntField(term128690, term128690.getClass(), "exp", 923308344);
        setIntField(term128690, term128690.getClass(), "printCount", -30626466);
        setIntField(term128690, term128690.getClass(), "useCount", 393740799);
        setBooleanField(term128690, term128690.getClass(), "isNew", true);
        setField(term128690, term128690.getClass(), "kaikaDate", "0000-00-00 00:00:00.0");
        setField(term128690, term128690.getClass(), "choKaikaDate", "0000-00-00 00:00:00.0");
        setIntField(term128690, term128690.getClass(), "skillId", -148451361);
        setBooleanField(term128690, term128690.getClass(), "isAcquired", true);
        setField(term128690, term128690.getClass(), "created", "0000-00-00 00:00:00.0");
        term129035 = new Integer(-1277311250);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserCard");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term129035;
        callMethod(klass, "setSkillId", argTypes, term128690, args);
    }

};


