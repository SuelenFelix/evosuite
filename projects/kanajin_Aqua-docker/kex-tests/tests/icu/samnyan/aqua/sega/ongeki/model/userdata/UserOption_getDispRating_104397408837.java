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

public class UserOption_getDispRating_104397408837 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term325545;

    public UserOption_getDispRating_104397408837() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term325551 = new Long(-8698230272673009418L);
        term325545 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserOption"));
        Object term325547 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term325549 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term325565 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term325566 = newInstance(Class.forName("java.time.LocalDate"));
        Object term325570 = newInstance(Class.forName("java.time.LocalTime"));
        Object term325575 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term325576 = newInstance(Class.forName("java.time.LocalDate"));
        Object term325580 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term325545, term325545.getClass(), "id", -4880928406946082233L);
        setLongField(term325547, term325547.getClass(), "id", -4001644618724055424L);
        setLongField(term325549, term325549.getClass(), "id", -4878963347145686524L);
        setField(term325549, term325549.getClass(), "extId", term325551);
        setField(term325549, term325549.getClass(), "luid", "FxSoLZGfAg");
        setIntField(term325566, term325566.getClass(), "year", 2011);
        setShortField(term325566, term325566.getClass(), "month", (short) 12);
        setShortField(term325566, term325566.getClass(), "day", (short) 15);
        setField(term325565, term325565.getClass(), "date", term325566);
        setByteField(term325570, term325570.getClass(), "hour", (byte) 12);
        setByteField(term325570, term325570.getClass(), "minute", (byte) 11);
        setByteField(term325570, term325570.getClass(), "second", (byte) 32);
        setIntField(term325570, term325570.getClass(), "nano", 144358710);
        setField(term325565, term325565.getClass(), "time", term325570);
        setField(term325549, term325549.getClass(), "registerTime", term325565);
        setIntField(term325576, term325576.getClass(), "year", 2012);
        setShortField(term325576, term325576.getClass(), "month", (short) 9);
        setShortField(term325576, term325576.getClass(), "day", (short) 16);
        setField(term325575, term325575.getClass(), "date", term325576);
        setByteField(term325580, term325580.getClass(), "hour", (byte) 17);
        setByteField(term325580, term325580.getClass(), "minute", (byte) 56);
        setByteField(term325580, term325580.getClass(), "second", (byte) 20);
        setIntField(term325580, term325580.getClass(), "nano", 87689227);
        setField(term325575, term325575.getClass(), "time", term325580);
        setField(term325549, term325549.getClass(), "accessTime", term325575);
        setField(term325547, term325547.getClass(), "card", term325549);
        setField(term325547, term325547.getClass(), "userName", "bHNAuPAjNU");
        setIntField(term325547, term325547.getClass(), "level", 56635051);
        setIntField(term325547, term325547.getClass(), "reincarnationNum", 749664494);
        setLongField(term325547, term325547.getClass(), "exp", -2360843840871949494L);
        setLongField(term325547, term325547.getClass(), "point", 1222517731380569533L);
        setLongField(term325547, term325547.getClass(), "totalPoint", -8892535831919258980L);
        setIntField(term325547, term325547.getClass(), "playCount", 563325384);
        setIntField(term325547, term325547.getClass(), "jewelCount", -568724303);
        setIntField(term325547, term325547.getClass(), "totalJewelCount", 838865803);
        setIntField(term325547, term325547.getClass(), "medalCount", -1570591854);
        setIntField(term325547, term325547.getClass(), "playerRating", 518961886);
        setIntField(term325547, term325547.getClass(), "highestRating", 175099095);
        setIntField(term325547, term325547.getClass(), "battlePoint", 1997820019);
        setIntField(term325547, term325547.getClass(), "bestBattlePoint", -396199744);
        setIntField(term325547, term325547.getClass(), "overDamageBattlePoint", 1520824865);
        setBooleanField(term325547, term325547.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term325547, term325547.getClass(), "nameplateId", 89866725);
        setIntField(term325547, term325547.getClass(), "trophyId", 1222145880);
        setIntField(term325547, term325547.getClass(), "cardId", 273793686);
        setIntField(term325547, term325547.getClass(), "characterId", 1264533805);
        setIntField(term325547, term325547.getClass(), "characterVoiceNo", -1649260025);
        setIntField(term325547, term325547.getClass(), "tabSetting", 1773938640);
        setIntField(term325547, term325547.getClass(), "tabSortSetting", 1250544515);
        setIntField(term325547, term325547.getClass(), "cardCategorySetting", -967153556);
        setIntField(term325547, term325547.getClass(), "cardSortSetting", 2013194757);
        setIntField(term325547, term325547.getClass(), "rivalScoreCategorySetting", 449905089);
        setIntField(term325547, term325547.getClass(), "playedTutorialBit", -51919642);
        setIntField(term325547, term325547.getClass(), "firstTutorialCancelNum", -1920693520);
        setLongField(term325547, term325547.getClass(), "sumTechHighScore", -3520494342810157627L);
        setLongField(term325547, term325547.getClass(), "sumTechBasicHighScore", -5131241540742678765L);
        setLongField(term325547, term325547.getClass(), "sumTechAdvancedHighScore", -3356107403622453970L);
        setLongField(term325547, term325547.getClass(), "sumTechExpertHighScore", -6756741133050983163L);
        setLongField(term325547, term325547.getClass(), "sumTechMasterHighScore", -903192606390304440L);
        setLongField(term325547, term325547.getClass(), "sumTechLunaticHighScore", 3161880820674310046L);
        setLongField(term325547, term325547.getClass(), "sumBattleHighScore", 1155572511912471912L);
        setLongField(term325547, term325547.getClass(), "sumBattleBasicHighScore", 204122731595217996L);
        setLongField(term325547, term325547.getClass(), "sumBattleAdvancedHighScore", 3403150111101812458L);
        setLongField(term325547, term325547.getClass(), "sumBattleExpertHighScore", 4544618004878217308L);
        setLongField(term325547, term325547.getClass(), "sumBattleMasterHighScore", -1484278371007230600L);
        setLongField(term325547, term325547.getClass(), "sumBattleLunaticHighScore", -1242865535596626715L);
        setField(term325547, term325547.getClass(), "eventWatchedDate", "EfmQIBGPJV");
        setField(term325547, term325547.getClass(), "cmEventWatchedDate", "UmSoiTvSHt");
        setField(term325547, term325547.getClass(), "firstGameId", "qvoNfqOqJo");
        setField(term325547, term325547.getClass(), "firstRomVersion", "EDecvFBPaH");
        setField(term325547, term325547.getClass(), "firstDataVersion", "rLTdFlnrIw");
        setField(term325547, term325547.getClass(), "firstPlayDate", "VXDKxjulIG");
        setField(term325547, term325547.getClass(), "lastGameId", "XGhOziifnr");
        setField(term325547, term325547.getClass(), "lastRomVersion", "APtMdZCtLK");
        setField(term325547, term325547.getClass(), "lastDataVersion", "mIQaDYdADA");
        setField(term325547, term325547.getClass(), "compatibleCmVersion", "UVVGKyzqlW");
        setField(term325547, term325547.getClass(), "lastPlayDate", "apLavXEAaR");
        setIntField(term325547, term325547.getClass(), "lastPlaceId", 1125490304);
        setField(term325547, term325547.getClass(), "lastPlaceName", "iXNpINWXkk");
        setIntField(term325547, term325547.getClass(), "lastRegionId", -1525117093);
        setField(term325547, term325547.getClass(), "lastRegionName", "GYmcrSTulM");
        setIntField(term325547, term325547.getClass(), "lastAllNetId", 2115675125);
        setField(term325547, term325547.getClass(), "lastClientId", "rVCmbpEdSM");
        setIntField(term325547, term325547.getClass(), "lastUsedDeckId", -149902461);
        setIntField(term325547, term325547.getClass(), "lastPlayMusicLevel", -1160604293);
        setIntField(term325547, term325547.getClass(), "lastEmoneyBrand", 57825863);
        setField(term325545, term325545.getClass(), "user", term325547);
        setIntField(term325545, term325545.getClass(), "optionSet", -83959584);
        setIntField(term325545, term325545.getClass(), "speed", 1886545659);
        setIntField(term325545, term325545.getClass(), "mirror", 1303542813);
        setIntField(term325545, term325545.getClass(), "judgeTiming", 1446617120);
        setIntField(term325545, term325545.getClass(), "judgeAdjustment", 1406436405);
        setIntField(term325545, term325545.getClass(), "abort", 1318682577);
        setIntField(term325545, term325545.getClass(), "stealthField", 1241769140);
        setIntField(term325545, term325545.getClass(), "tapSound", 111499810);
        setIntField(term325545, term325545.getClass(), "volGuide", -1526847867);
        setIntField(term325545, term325545.getClass(), "volAll", -2078142732);
        setIntField(term325545, term325545.getClass(), "volTap", -1749382915);
        setIntField(term325545, term325545.getClass(), "volCrTap", -1040937952);
        setIntField(term325545, term325545.getClass(), "volHold", 1757267528);
        setIntField(term325545, term325545.getClass(), "volSide", -1927909925);
        setIntField(term325545, term325545.getClass(), "volFlick", 1958603938);
        setIntField(term325545, term325545.getClass(), "volBell", -1768157509);
        setIntField(term325545, term325545.getClass(), "volEnemy", -2024892419);
        setIntField(term325545, term325545.getClass(), "volSkill", -1810027047);
        setIntField(term325545, term325545.getClass(), "volDamage", 1864442883);
        setIntField(term325545, term325545.getClass(), "colorField", -817215280);
        setIntField(term325545, term325545.getClass(), "colorLaneBright", 2131309717);
        setIntField(term325545, term325545.getClass(), "colorWallBright", -2017546060);
        setIntField(term325545, term325545.getClass(), "colorLane", -79051975);
        setIntField(term325545, term325545.getClass(), "colorSide", -1410823118);
        setIntField(term325545, term325545.getClass(), "effectDamage", -248395247);
        setIntField(term325545, term325545.getClass(), "effectPos", 1561540215);
        setIntField(term325545, term325545.getClass(), "judgeDisp", -806864553);
        setIntField(term325545, term325545.getClass(), "judgePos", -955709032);
        setIntField(term325545, term325545.getClass(), "judgeBreak", 400962153);
        setIntField(term325545, term325545.getClass(), "judgeHit", 14906503);
        setIntField(term325545, term325545.getClass(), "platinumBreakDisp", 1996758002);
        setIntField(term325545, term325545.getClass(), "judgeCriticalBreak", -106197031);
        setIntField(term325545, term325545.getClass(), "matching", -526642000);
        setIntField(term325545, term325545.getClass(), "dispPlayerLv", -1236071949);
        setIntField(term325545, term325545.getClass(), "dispRating", -696047901);
        setIntField(term325545, term325545.getClass(), "dispBP", -2026730922);
        setIntField(term325545, term325545.getClass(), "headphone", -352488332);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserOption");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDispRating", argTypes, term325545, args);
    }

};


