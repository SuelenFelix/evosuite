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

public class UserActivity_getId_20414671301 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term283154;

    public UserActivity_getId_20414671301() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Long term283160 = new Long(6437032166810658671L);
        term283154 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserActivity"));
        Object term283156 = newInstance(Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserData"));
        Object term283158 = newInstance(Class.forName("icu.samnyan.aqua.sega.general.model.Card"));
        Object term283174 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term283175 = newInstance(Class.forName("java.time.LocalDate"));
        Object term283179 = newInstance(Class.forName("java.time.LocalTime"));
        Object term283184 = newInstance(Class.forName("java.time.LocalDateTime"));
        Object term283185 = newInstance(Class.forName("java.time.LocalDate"));
        Object term283189 = newInstance(Class.forName("java.time.LocalTime"));
        setLongField(term283154, term283154.getClass(), "id", 4665524974829721450L);
        setLongField(term283156, term283156.getClass(), "id", 1002614751788731341L);
        setLongField(term283158, term283158.getClass(), "id", 6931304439892616142L);
        setField(term283158, term283158.getClass(), "extId", term283160);
        setField(term283158, term283158.getClass(), "luid", "DEzXMDcBeO");
        setIntField(term283175, term283175.getClass(), "year", 2029);
        setShortField(term283175, term283175.getClass(), "month", (short) 5);
        setShortField(term283175, term283175.getClass(), "day", (short) 2);
        setField(term283174, term283174.getClass(), "date", term283175);
        setByteField(term283179, term283179.getClass(), "hour", (byte) 20);
        setByteField(term283179, term283179.getClass(), "minute", (byte) 38);
        setByteField(term283179, term283179.getClass(), "second", (byte) 19);
        setIntField(term283179, term283179.getClass(), "nano", 561424935);
        setField(term283174, term283174.getClass(), "time", term283179);
        setField(term283158, term283158.getClass(), "registerTime", term283174);
        setIntField(term283185, term283185.getClass(), "year", 2024);
        setShortField(term283185, term283185.getClass(), "month", (short) 3);
        setShortField(term283185, term283185.getClass(), "day", (short) 2);
        setField(term283184, term283184.getClass(), "date", term283185);
        setByteField(term283189, term283189.getClass(), "hour", (byte) 11);
        setByteField(term283189, term283189.getClass(), "minute", (byte) 6);
        setByteField(term283189, term283189.getClass(), "second", (byte) 30);
        setIntField(term283189, term283189.getClass(), "nano", 785775117);
        setField(term283184, term283184.getClass(), "time", term283189);
        setField(term283158, term283158.getClass(), "accessTime", term283184);
        setField(term283156, term283156.getClass(), "card", term283158);
        setField(term283156, term283156.getClass(), "userName", "omCAhxkVhc");
        setIntField(term283156, term283156.getClass(), "level", 131919044);
        setIntField(term283156, term283156.getClass(), "reincarnationNum", -1908209922);
        setLongField(term283156, term283156.getClass(), "exp", 4728741351213959207L);
        setLongField(term283156, term283156.getClass(), "point", 2771259090395685221L);
        setLongField(term283156, term283156.getClass(), "totalPoint", 3036845552362637901L);
        setIntField(term283156, term283156.getClass(), "playCount", -831821447);
        setIntField(term283156, term283156.getClass(), "jewelCount", 1071805713);
        setIntField(term283156, term283156.getClass(), "totalJewelCount", -258014704);
        setIntField(term283156, term283156.getClass(), "medalCount", 1010201759);
        setIntField(term283156, term283156.getClass(), "playerRating", 47387847);
        setIntField(term283156, term283156.getClass(), "highestRating", -339675979);
        setIntField(term283156, term283156.getClass(), "battlePoint", 541697068);
        setIntField(term283156, term283156.getClass(), "bestBattlePoint", -942757980);
        setIntField(term283156, term283156.getClass(), "overDamageBattlePoint", 1228061281);
        setBooleanField(term283156, term283156.getClass(), "isDialogWatchedSuggestMemory", true);
        setIntField(term283156, term283156.getClass(), "nameplateId", 1306691725);
        setIntField(term283156, term283156.getClass(), "trophyId", 57721881);
        setIntField(term283156, term283156.getClass(), "cardId", -256700241);
        setIntField(term283156, term283156.getClass(), "characterId", -1242840972);
        setIntField(term283156, term283156.getClass(), "characterVoiceNo", 681981579);
        setIntField(term283156, term283156.getClass(), "tabSetting", 623545129);
        setIntField(term283156, term283156.getClass(), "tabSortSetting", 873477133);
        setIntField(term283156, term283156.getClass(), "cardCategorySetting", -2112632680);
        setIntField(term283156, term283156.getClass(), "cardSortSetting", -167983517);
        setIntField(term283156, term283156.getClass(), "rivalScoreCategorySetting", 631482306);
        setIntField(term283156, term283156.getClass(), "playedTutorialBit", -1016827606);
        setIntField(term283156, term283156.getClass(), "firstTutorialCancelNum", -1832397774);
        setLongField(term283156, term283156.getClass(), "sumTechHighScore", -7303904721562119027L);
        setLongField(term283156, term283156.getClass(), "sumTechBasicHighScore", -5518157691954529624L);
        setLongField(term283156, term283156.getClass(), "sumTechAdvancedHighScore", -1440422463883044793L);
        setLongField(term283156, term283156.getClass(), "sumTechExpertHighScore", -1060817726289950131L);
        setLongField(term283156, term283156.getClass(), "sumTechMasterHighScore", -3205710572421465504L);
        setLongField(term283156, term283156.getClass(), "sumTechLunaticHighScore", -7639830238673443383L);
        setLongField(term283156, term283156.getClass(), "sumBattleHighScore", -140919564585110059L);
        setLongField(term283156, term283156.getClass(), "sumBattleBasicHighScore", 4819184350672605217L);
        setLongField(term283156, term283156.getClass(), "sumBattleAdvancedHighScore", -5456632931100643469L);
        setLongField(term283156, term283156.getClass(), "sumBattleExpertHighScore", 3418940277359143443L);
        setLongField(term283156, term283156.getClass(), "sumBattleMasterHighScore", -1254526561409722178L);
        setLongField(term283156, term283156.getClass(), "sumBattleLunaticHighScore", 8659053390557850018L);
        setField(term283156, term283156.getClass(), "eventWatchedDate", "BYmfYmCPCO");
        setField(term283156, term283156.getClass(), "cmEventWatchedDate", "czTcTFSZaH");
        setField(term283156, term283156.getClass(), "firstGameId", "xoGaXvlJPi");
        setField(term283156, term283156.getClass(), "firstRomVersion", "YTuxwCMRBA");
        setField(term283156, term283156.getClass(), "firstDataVersion", "sETkaSuzDp");
        setField(term283156, term283156.getClass(), "firstPlayDate", "lZBpPKYhfN");
        setField(term283156, term283156.getClass(), "lastGameId", "QurcwJtnIZ");
        setField(term283156, term283156.getClass(), "lastRomVersion", "hkknNIOuCb");
        setField(term283156, term283156.getClass(), "lastDataVersion", "nDBGVJQKYa");
        setField(term283156, term283156.getClass(), "compatibleCmVersion", "vibSudGWEW");
        setField(term283156, term283156.getClass(), "lastPlayDate", "rZCRybHPmf");
        setIntField(term283156, term283156.getClass(), "lastPlaceId", 2091980824);
        setField(term283156, term283156.getClass(), "lastPlaceName", "dWFHxHnzji");
        setIntField(term283156, term283156.getClass(), "lastRegionId", 1881481825);
        setField(term283156, term283156.getClass(), "lastRegionName", "onRbsuWQtT");
        setIntField(term283156, term283156.getClass(), "lastAllNetId", 437079367);
        setField(term283156, term283156.getClass(), "lastClientId", "quIfJIsZRI");
        setIntField(term283156, term283156.getClass(), "lastUsedDeckId", 224578330);
        setIntField(term283156, term283156.getClass(), "lastPlayMusicLevel", 1069993938);
        setIntField(term283156, term283156.getClass(), "lastEmoneyBrand", -197919007);
        setField(term283154, term283154.getClass(), "user", term283156);
        setIntField(term283154, term283154.getClass(), "kind", -581814935);
        setIntField(term283154, term283154.getClass(), "activityId", -884782980);
        setIntField(term283154, term283154.getClass(), "sortNumber", 435645173);
        setIntField(term283154, term283154.getClass(), "param1", -2127352323);
        setIntField(term283154, term283154.getClass(), "param2", 2097474452);
        setIntField(term283154, term283154.getClass(), "param3", -1540959741);
        setIntField(term283154, term283154.getClass(), "param4", -415034768);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.ongeki.model.userdata.UserActivity");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getId", argTypes, term283154, args);
    }

};


