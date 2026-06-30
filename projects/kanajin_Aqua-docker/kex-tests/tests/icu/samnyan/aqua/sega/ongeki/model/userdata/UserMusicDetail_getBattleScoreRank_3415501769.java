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

public class UserMusicDetail_getBattleScoreRank_3415501769 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term407699;

    public UserMusicDetail_getBattleScoreRank_3415501769() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term407705 = new Long(7265006047025305787L);
        term407699 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserMusicDetail"));
        Object term407701 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term407703 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term407719 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term407720 = newInstance(Class.forName("java.time.LocalDate"));
        Object term407724 = newInstance(Class.forName("java.time.LocalTime"));
        Object term407729 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term407730 = newInstance(Class.forName("java.time.LocalDate"));
        Object term407734 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term407699, term407699.getClass(), "id", 822276414731142092L);
        setLongField(term407701, term407701.getClass(), "id", 8089248698485794254L);
        setLongField(term407703, term407703.getClass(), "id", 3711721846786904409L);
        setField(term407703, term407703.getClass(), "extId", term407705);
        setField(term407703, term407703.getClass(), "luid", "DMZTtroqUY");
        setIntField(term407720, term407720.getClass(), "year", 2010);
        setShortField(term407720, term407720.getClass(), "month", (short) 7);
        setShortField(term407720, term407720.getClass(), "day", (short) 26);
        setField(term407719, term407719.getClass(), "date", term407720);
        setByteField(term407724, term407724.getClass(), "hour", (byte) 7);
        setByteField(term407724, term407724.getClass(), "minute", (byte) 19);
        setByteField(term407724, term407724.getClass(), "second", (byte) 57);
        setIntField(term407724, term407724.getClass(), "nano", 579137908);
        setField(term407719, term407719.getClass(), "time", term407724);
        setField(term407703, term407703.getClass(), "registerTime", term407719);
        setIntField(term407730, term407730.getClass(), "year", 2029);
        setShortField(term407730, term407730.getClass(), "month", (short) 9);
        setShortField(term407730, term407730.getClass(), "day", (short) 3);
        setField(term407729, term407729.getClass(), "date", term407730);
        setByteField(term407734, term407734.getClass(), "hour", (byte) 13);
        setByteField(term407734, term407734.getClass(), "minute", (byte) 25);
        setByteField(term407734, term407734.getClass(), "second", (byte) 12);
        setIntField(term407734, term407734.getClass(), "nano", 273536435);
        setField(term407729, term407729.getClass(), "time", term407734);
        setField(term407703, term407703.getClass(), "accessTime", term407729);
        setField(term407701, term407701.getClass(), "card", term407703);
        setField(term407701, term407701.getClass(), "userName", "oNyKoUxrhC");
        setIntField(term407701, term407701.getClass(), "level", -747151247);
        setIntField(term407701, term407701.getClass(), "reincarnationNum", 2105021079);
        setLongField(term407701, term407701.getClass(), "exp", 5224036234170448136L);
        setLongField(term407701, term407701.getClass(), "point", -2746894021637841534L);
        setLongField(term407701, term407701.getClass(), "totalPoint", -4811828139614324758L);
        setIntField(term407701, term407701.getClass(), "playCount", 597685504);
        setIntField(term407701, term407701.getClass(), "jewelCount", 1287364811);
        setIntField(term407701, term407701.getClass(), "totalJewelCount", 426122346);
        setIntField(term407701, term407701.getClass(), "medalCount", 591009112);
        setIntField(term407701, term407701.getClass(), "playerRating", -1430913381);
        setIntField(term407701, term407701.getClass(), "highestRating", 214932850);
        setIntField(term407701, term407701.getClass(), "battlePoint", 1757839617);
        setIntField(term407701, term407701.getClass(), "bestBattlePoint", 691161018);
        setIntField(term407701, term407701.getClass(), "overDamageBattlePoint", -330784048);
        setBooleanField(term407701, term407701.getClass(), "isDialogWatchedSuggestMemory", false);
        setIntField(term407701, term407701.getClass(), "nameplateId", 604589819);
        setIntField(term407701, term407701.getClass(), "trophyId", 2098939667);
        setIntField(term407701, term407701.getClass(), "cardId", 111288260);
        setIntField(term407701, term407701.getClass(), "characterId", -42355061);
        setIntField(term407701, term407701.getClass(), "characterVoiceNo", 1023659601);
        setIntField(term407701, term407701.getClass(), "tabSetting", 1586333346);
        setIntField(term407701, term407701.getClass(), "tabSortSetting", -863931293);
        setIntField(term407701, term407701.getClass(), "cardCategorySetting", -57161737);
        setIntField(term407701, term407701.getClass(), "cardSortSetting", 986258161);
        setIntField(term407701, term407701.getClass(), "rivalScoreCategorySetting", 533902933);
        setIntField(term407701, term407701.getClass(), "playedTutorialBit", -1159824938);
        setIntField(term407701, term407701.getClass(), "firstTutorialCancelNum", 1273916688);
        setLongField(term407701, term407701.getClass(), "sumTechHighScore", 492526995924434406L);
        setLongField(term407701, term407701.getClass(), "sumTechBasicHighScore", 3040101547176632170L);
        setLongField(term407701, term407701.getClass(), "sumTechAdvancedHighScore", 6480286252341526185L);
        setLongField(term407701, term407701.getClass(), "sumTechExpertHighScore", 6928955122811296988L);
        setLongField(term407701, term407701.getClass(), "sumTechMasterHighScore", 5801350595640941244L);
        setLongField(term407701, term407701.getClass(), "sumTechLunaticHighScore", -5319750845600888353L);
        setLongField(term407701, term407701.getClass(), "sumBattleHighScore", -6913119769739168671L);
        setLongField(term407701, term407701.getClass(), "sumBattleBasicHighScore", -2781730112585252230L);
        setLongField(term407701, term407701.getClass(), "sumBattleAdvancedHighScore", 7012532433376252398L);
        setLongField(term407701, term407701.getClass(), "sumBattleExpertHighScore", 7641445067975604609L);
        setLongField(term407701, term407701.getClass(), "sumBattleMasterHighScore", 4515464480812491472L);
        setLongField(term407701, term407701.getClass(), "sumBattleLunaticHighScore", -6467775953887908035L);
        setField(term407701, term407701.getClass(), "eventWatchedDate", "BbatbkJitj");
        setField(term407701, term407701.getClass(), "cmEventWatchedDate", "hkkpBcLSbC");
        setField(term407701, term407701.getClass(), "firstGameId", "TevPeGnudp");
        setField(term407701, term407701.getClass(), "firstRomVersion", "ceeHrBkcFo");
        setField(term407701, term407701.getClass(), "firstDataVersion", "DGxPvhVQFo");
        setField(term407701, term407701.getClass(), "firstPlayDate", "LwdtKtzbQM");
        setField(term407701, term407701.getClass(), "lastGameId", "RswOuBbbNu");
        setField(term407701, term407701.getClass(), "lastRomVersion", "MixesEhcqK");
        setField(term407701, term407701.getClass(), "lastDataVersion", "PesReLkGys");
        setField(term407701, term407701.getClass(), "compatibleCmVersion", "TtekhngYqp");
        setField(term407701, term407701.getClass(), "lastPlayDate", "TizvOawnRi");
        setIntField(term407701, term407701.getClass(), "lastPlaceId", 848070641);
        setField(term407701, term407701.getClass(), "lastPlaceName", "OuKLWFvKua");
        setIntField(term407701, term407701.getClass(), "lastRegionId", -1473335774);
        setField(term407701, term407701.getClass(), "lastRegionName", "rmwXadhLNF");
        setIntField(term407701, term407701.getClass(), "lastAllNetId", -1474912180);
        setField(term407701, term407701.getClass(), "lastClientId", "zoHIksrffA");
        setIntField(term407701, term407701.getClass(), "lastUsedDeckId", 338978679);
        setIntField(term407701, term407701.getClass(), "lastPlayMusicLevel", -936348349);
        setIntField(term407701, term407701.getClass(), "lastEmoneyBrand", -7954103);
        setField(term407699, term407699.getClass(), "user", term407701);
        setIntField(term407699, term407699.getClass(), "musicId", 1986803914);
        setIntField(term407699, term407699.getClass(), "level", -2120765052);
        setIntField(term407699, term407699.getClass(), "playCount", 1721227579);
        setIntField(term407699, term407699.getClass(), "techScoreMax", -933936253);
        setIntField(term407699, term407699.getClass(), "techScoreRank", -1101593518);
        setIntField(term407699, term407699.getClass(), "battleScoreMax", -707475295);
        setIntField(term407699, term407699.getClass(), "battleScoreRank", 1036541518);
        setIntField(term407699, term407699.getClass(), "maxComboCount", -2086695557);
        setIntField(term407699, term407699.getClass(), "maxOverKill", 1496060225);
        setIntField(term407699, term407699.getClass(), "maxTeamOverKill", 315082965);
        setBooleanField(term407699, term407699.getClass(), "isFullBell", true);
        setBooleanField(term407699, term407699.getClass(), "isFullCombo", true);
        setBooleanField(term407699, term407699.getClass(), "isAllBreake", false);
        setBooleanField(term407699, term407699.getClass(), "isLock", true);
        setIntField(term407699, term407699.getClass(), "clearStatus", 99227931);
        setBooleanField(term407699, term407699.getClass(), "isStoryWatched", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserMusicDetail");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getBattleScoreRank", argTypes, term407699, args);
    }

};


