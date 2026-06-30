package icu.samnyan.aqua.api.model.resp.sega.ongeki.external;

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
import static icu.samnyan.aqua.api.model.resp.sega.ongeki.external.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class ExternalUserData_setFirstPlayDate_1421671114103 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term137166;

    public ExternalUserData_setFirstPlayDate_1421671114103() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term137166 = newInstance(Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.ExternalUserData"));
        setField(term137166, term137166.getClass(), "accessCode", "IjBvNqEnli");
        setField(term137166, term137166.getClass(), "userName", "vSxIvcYZaq");
        setIntField(term137166, term137166.getClass(), "level", -1260018665);
        setIntField(term137166, term137166.getClass(), "reincarnationNum", -906240011);
        setLongField(term137166, term137166.getClass(), "exp", -1688804252926718284L);
        setLongField(term137166, term137166.getClass(), "point", 4454946208738363605L);
        setLongField(term137166, term137166.getClass(), "totalPoint", -4208066959909294386L);
        setIntField(term137166, term137166.getClass(), "playCount", -312455610);
        setIntField(term137166, term137166.getClass(), "jewelCount", -1399099431);
        setIntField(term137166, term137166.getClass(), "totalJewelCount", 250367640);
        setIntField(term137166, term137166.getClass(), "medalCount", 1334196924);
        setIntField(term137166, term137166.getClass(), "playerRating", 1517494853);
        setIntField(term137166, term137166.getClass(), "highestRating", 482040968);
        setIntField(term137166, term137166.getClass(), "battlePoint", -1366242210);
        setIntField(term137166, term137166.getClass(), "bestBattlePoint", 372970729);
        setIntField(term137166, term137166.getClass(), "overDamageBattlePoint", 244982888);
        setIntField(term137166, term137166.getClass(), "nameplateId", 1769633730);
        setIntField(term137166, term137166.getClass(), "trophyId", -561958182);
        setIntField(term137166, term137166.getClass(), "cardId", 1866935396);
        setIntField(term137166, term137166.getClass(), "characterId", 1656228068);
        setIntField(term137166, term137166.getClass(), "tabSetting", 924139752);
        setIntField(term137166, term137166.getClass(), "tabSortSetting", -1549466841);
        setIntField(term137166, term137166.getClass(), "cardCategorySetting", -1317532652);
        setIntField(term137166, term137166.getClass(), "cardSortSetting", 1682527043);
        setIntField(term137166, term137166.getClass(), "rivalScoreCategorySetting", -1330237510);
        setIntField(term137166, term137166.getClass(), "playedTutorialBit", 346755693);
        setIntField(term137166, term137166.getClass(), "firstTutorialCancelNum", -207497615);
        setLongField(term137166, term137166.getClass(), "sumTechHighScore", -1395691634635638030L);
        setLongField(term137166, term137166.getClass(), "sumTechBasicHighScore", 8414270182417566460L);
        setLongField(term137166, term137166.getClass(), "sumTechAdvancedHighScore", 7083737253635160841L);
        setLongField(term137166, term137166.getClass(), "sumTechExpertHighScore", 2581530316656260278L);
        setLongField(term137166, term137166.getClass(), "sumTechMasterHighScore", 3958501976518661751L);
        setLongField(term137166, term137166.getClass(), "sumTechLunaticHighScore", 1000703382510229403L);
        setLongField(term137166, term137166.getClass(), "sumBattleHighScore", 1154803178554763165L);
        setLongField(term137166, term137166.getClass(), "sumBattleBasicHighScore", -5150763956037071946L);
        setLongField(term137166, term137166.getClass(), "sumBattleAdvancedHighScore", -4768166544457221181L);
        setLongField(term137166, term137166.getClass(), "sumBattleExpertHighScore", 5252678559459002370L);
        setLongField(term137166, term137166.getClass(), "sumBattleMasterHighScore", -4695102106942000328L);
        setLongField(term137166, term137166.getClass(), "sumBattleLunaticHighScore", -828615209799812817L);
        setField(term137166, term137166.getClass(), "eventWatchedDate", "eSMUXSYlki");
        setField(term137166, term137166.getClass(), "cmEventWatchedDate", "iglvlgJCvj");
        setField(term137166, term137166.getClass(), "firstGameId", "bsMcvKRfgr");
        setField(term137166, term137166.getClass(), "firstRomVersion", "VagonZzeLk");
        setField(term137166, term137166.getClass(), "firstDataVersion", "cvStjsttcb");
        setField(term137166, term137166.getClass(), "firstPlayDate", "ZvFoPIgeHX");
        setField(term137166, term137166.getClass(), "lastGameId", "PMzNWyWNZu");
        setField(term137166, term137166.getClass(), "lastRomVersion", "GGPgHlZyam");
        setField(term137166, term137166.getClass(), "lastDataVersion", "iWHYNyPJMh");
        setField(term137166, term137166.getClass(), "compatibleCmVersion", "BNVIIiwoWE");
        setField(term137166, term137166.getClass(), "lastPlayDate", "nHcDLOzpGp");
        setIntField(term137166, term137166.getClass(), "lastPlaceId", -1087598745);
        setField(term137166, term137166.getClass(), "lastPlaceName", "fwyfjOCqkP");
        setIntField(term137166, term137166.getClass(), "lastRegionId", -39873779);
        setField(term137166, term137166.getClass(), "lastRegionName", "MrjckSmxnQ");
        setIntField(term137166, term137166.getClass(), "lastAllNetId", 1088623754);
        setField(term137166, term137166.getClass(), "lastClientId", "XGMXKTMgcK");
        setIntField(term137166, term137166.getClass(), "lastUsedDeckId", -788617898);
        setIntField(term137166, term137166.getClass(), "lastPlayMusicLevel", 969316046);
        setIntField(term137166, term137166.getClass(), "lastEmoneyBrand", -2054674756);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.api.model.resp.sega.ongeki.external.ExternalUserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "UJsiqZiscj";
        callMethod(klass, "setFirstPlayDate", argTypes, term137166, args);
    }

};


