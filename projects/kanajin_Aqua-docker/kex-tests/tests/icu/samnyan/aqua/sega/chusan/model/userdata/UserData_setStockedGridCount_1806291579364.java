package icu.samnyan.aqua.sega.chusan.model.userdata;

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
import static icu.samnyan.aqua.sega.chusan.model.userdata.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class UserData_setStockedGridCount_1806291579364 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term289676;
     Object term289753;

    public UserData_setStockedGridCount_1806291579364() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term289676 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserData"));
        setLongField(term289676, term289676.getClass(), "id", 0L);
        setField(term289676, term289676.getClass(), "card", null);
        setField(term289676, term289676.getClass(), "userName", null);
        setIntField(term289676, term289676.getClass(), "level", 0);
        setIntField(term289676, term289676.getClass(), "reincarnationNum", 0);
        setField(term289676, term289676.getClass(), "exp", null);
        setLongField(term289676, term289676.getClass(), "point", 0L);
        setLongField(term289676, term289676.getClass(), "totalPoint", 0L);
        setIntField(term289676, term289676.getClass(), "playCount", 0);
        setIntField(term289676, term289676.getClass(), "multiPlayCount", 0);
        setIntField(term289676, term289676.getClass(), "playerRating", 0);
        setIntField(term289676, term289676.getClass(), "highestRating", 0);
        setIntField(term289676, term289676.getClass(), "nameplateId", 0);
        setIntField(term289676, term289676.getClass(), "frameId", 0);
        setIntField(term289676, term289676.getClass(), "characterId", 0);
        setIntField(term289676, term289676.getClass(), "trophyId", 0);
        setIntField(term289676, term289676.getClass(), "playedTutorialBit", 0);
        setIntField(term289676, term289676.getClass(), "firstTutorialCancelNum", 0);
        setIntField(term289676, term289676.getClass(), "masterTutorialCancelNum", 0);
        setIntField(term289676, term289676.getClass(), "totalMapNum", 0);
        setLongField(term289676, term289676.getClass(), "totalHiScore", 0L);
        setLongField(term289676, term289676.getClass(), "totalBasicHighScore", 0L);
        setLongField(term289676, term289676.getClass(), "totalAdvancedHighScore", 0L);
        setLongField(term289676, term289676.getClass(), "totalExpertHighScore", 0L);
        setLongField(term289676, term289676.getClass(), "totalMasterHighScore", 0L);
        setLongField(term289676, term289676.getClass(), "totalUltimaHighScore", 0L);
        setField(term289676, term289676.getClass(), "eventWatchedDate", null);
        setIntField(term289676, term289676.getClass(), "friendCount", 0);
        setField(term289676, term289676.getClass(), "firstGameId", null);
        setField(term289676, term289676.getClass(), "firstRomVersion", null);
        setField(term289676, term289676.getClass(), "firstDataVersion", null);
        setField(term289676, term289676.getClass(), "firstPlayDate", null);
        setField(term289676, term289676.getClass(), "lastGameId", null);
        setField(term289676, term289676.getClass(), "lastRomVersion", null);
        setField(term289676, term289676.getClass(), "lastDataVersion", null);
        setField(term289676, term289676.getClass(), "lastLoginDate", null);
        setField(term289676, term289676.getClass(), "lastPlayDate", null);
        setIntField(term289676, term289676.getClass(), "lastPlaceId", 0);
        setField(term289676, term289676.getClass(), "lastPlaceName", null);
        setField(term289676, term289676.getClass(), "lastRegionId", null);
        setField(term289676, term289676.getClass(), "lastRegionName", null);
        setField(term289676, term289676.getClass(), "lastAllNetId", null);
        setField(term289676, term289676.getClass(), "lastClientId", null);
        setField(term289676, term289676.getClass(), "lastCountryCode", null);
        setField(term289676, term289676.getClass(), "userNameEx", null);
        setField(term289676, term289676.getClass(), "compatibleCmVersion", null);
        setIntField(term289676, term289676.getClass(), "medal", 0);
        setIntField(term289676, term289676.getClass(), "mapIconId", 0);
        setIntField(term289676, term289676.getClass(), "voiceId", 0);
        setIntField(term289676, term289676.getClass(), "avatarWear", 0);
        setIntField(term289676, term289676.getClass(), "avatarHead", 0);
        setIntField(term289676, term289676.getClass(), "avatarFace", 0);
        setIntField(term289676, term289676.getClass(), "avatarSkin", 0);
        setIntField(term289676, term289676.getClass(), "avatarItem", 0);
        setIntField(term289676, term289676.getClass(), "avatarFront", 0);
        setIntField(term289676, term289676.getClass(), "avatarBack", 0);
        setIntField(term289676, term289676.getClass(), "classEmblemBase", 0);
        setIntField(term289676, term289676.getClass(), "classEmblemMedal", 0);
        setIntField(term289676, term289676.getClass(), "stockedGridCount", 0);
        setIntField(term289676, term289676.getClass(), "exMapLoopCount", 0);
        setIntField(term289676, term289676.getClass(), "netBattlePlayCount", 0);
        setIntField(term289676, term289676.getClass(), "netBattleWinCount", 0);
        setIntField(term289676, term289676.getClass(), "netBattleLoseCount", 0);
        setIntField(term289676, term289676.getClass(), "netBattleConsecutiveWinCount", 0);
        setIntField(term289676, term289676.getClass(), "charaIllustId", 0);
        setIntField(term289676, term289676.getClass(), "skillId", 0);
        setIntField(term289676, term289676.getClass(), "overPowerPoint", 0);
        setIntField(term289676, term289676.getClass(), "overPowerRate", 0);
        setIntField(term289676, term289676.getClass(), "overPowerLowerRank", 0);
        setIntField(term289676, term289676.getClass(), "avatarPoint", 0);
        setIntField(term289676, term289676.getClass(), "battleRankId", 0);
        setIntField(term289676, term289676.getClass(), "battleRankPoint", 0);
        setIntField(term289676, term289676.getClass(), "eliteRankPoint", 0);
        setIntField(term289676, term289676.getClass(), "netBattle1stCount", 0);
        setIntField(term289676, term289676.getClass(), "netBattle2ndCount", 0);
        setIntField(term289676, term289676.getClass(), "netBattle3rdCount", 0);
        setIntField(term289676, term289676.getClass(), "netBattle4thCount", 0);
        setIntField(term289676, term289676.getClass(), "netBattleCorrection", 0);
        setIntField(term289676, term289676.getClass(), "netBattleErrCnt", 0);
        setIntField(term289676, term289676.getClass(), "netBattleHostErrCnt", 0);
        setIntField(term289676, term289676.getClass(), "battleRewardStatus", 0);
        setIntField(term289676, term289676.getClass(), "battleRewardIndex", 0);
        setIntField(term289676, term289676.getClass(), "battleRewardCount", 0);
        setIntField(term289676, term289676.getClass(), "ext1", 0);
        setIntField(term289676, term289676.getClass(), "ext2", 0);
        setIntField(term289676, term289676.getClass(), "ext3", 0);
        setIntField(term289676, term289676.getClass(), "ext4", 0);
        setIntField(term289676, term289676.getClass(), "ext5", 0);
        setIntField(term289676, term289676.getClass(), "ext6", 0);
        setIntField(term289676, term289676.getClass(), "ext7", 0);
        setIntField(term289676, term289676.getClass(), "ext8", 0);
        setIntField(term289676, term289676.getClass(), "ext9", 0);
        setIntField(term289676, term289676.getClass(), "ext10", 0);
        setField(term289676, term289676.getClass(), "extStr1", null);
        setField(term289676, term289676.getClass(), "extStr2", null);
        setLongField(term289676, term289676.getClass(), "extLong1", 0L);
        setLongField(term289676, term289676.getClass(), "extLong2", 0L);
        setField(term289676, term289676.getClass(), "rankUpChallengeResults", null);
        setBooleanField(term289676, term289676.getClass(), "isNetBattleHost", false);
        setIntField(term289676, term289676.getClass(), "netBattleEndState", 0);
        term289753 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term289753;
        callMethod(klass, "setStockedGridCount", argTypes, term289676, args);
    }

};


