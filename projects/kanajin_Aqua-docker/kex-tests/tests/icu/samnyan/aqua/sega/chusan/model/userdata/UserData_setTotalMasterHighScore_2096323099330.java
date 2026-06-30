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
import java.lang.Long;

public class UserData_setTotalMasterHighScore_2096323099330 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term287026;
     Object term287103;

    public UserData_setTotalMasterHighScore_2096323099330() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term287026 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserData"));
        setLongField(term287026, term287026.getClass(), "id", 0L);
        setField(term287026, term287026.getClass(), "card", null);
        setField(term287026, term287026.getClass(), "userName", null);
        setIntField(term287026, term287026.getClass(), "level", 0);
        setIntField(term287026, term287026.getClass(), "reincarnationNum", 0);
        setField(term287026, term287026.getClass(), "exp", null);
        setLongField(term287026, term287026.getClass(), "point", 0L);
        setLongField(term287026, term287026.getClass(), "totalPoint", 0L);
        setIntField(term287026, term287026.getClass(), "playCount", 0);
        setIntField(term287026, term287026.getClass(), "multiPlayCount", 0);
        setIntField(term287026, term287026.getClass(), "playerRating", 0);
        setIntField(term287026, term287026.getClass(), "highestRating", 0);
        setIntField(term287026, term287026.getClass(), "nameplateId", 0);
        setIntField(term287026, term287026.getClass(), "frameId", 0);
        setIntField(term287026, term287026.getClass(), "characterId", 0);
        setIntField(term287026, term287026.getClass(), "trophyId", 0);
        setIntField(term287026, term287026.getClass(), "playedTutorialBit", 0);
        setIntField(term287026, term287026.getClass(), "firstTutorialCancelNum", 0);
        setIntField(term287026, term287026.getClass(), "masterTutorialCancelNum", 0);
        setIntField(term287026, term287026.getClass(), "totalMapNum", 0);
        setLongField(term287026, term287026.getClass(), "totalHiScore", 0L);
        setLongField(term287026, term287026.getClass(), "totalBasicHighScore", 0L);
        setLongField(term287026, term287026.getClass(), "totalAdvancedHighScore", 0L);
        setLongField(term287026, term287026.getClass(), "totalExpertHighScore", 0L);
        setLongField(term287026, term287026.getClass(), "totalMasterHighScore", 0L);
        setLongField(term287026, term287026.getClass(), "totalUltimaHighScore", 0L);
        setField(term287026, term287026.getClass(), "eventWatchedDate", null);
        setIntField(term287026, term287026.getClass(), "friendCount", 0);
        setField(term287026, term287026.getClass(), "firstGameId", null);
        setField(term287026, term287026.getClass(), "firstRomVersion", null);
        setField(term287026, term287026.getClass(), "firstDataVersion", null);
        setField(term287026, term287026.getClass(), "firstPlayDate", null);
        setField(term287026, term287026.getClass(), "lastGameId", null);
        setField(term287026, term287026.getClass(), "lastRomVersion", null);
        setField(term287026, term287026.getClass(), "lastDataVersion", null);
        setField(term287026, term287026.getClass(), "lastLoginDate", null);
        setField(term287026, term287026.getClass(), "lastPlayDate", null);
        setIntField(term287026, term287026.getClass(), "lastPlaceId", 0);
        setField(term287026, term287026.getClass(), "lastPlaceName", null);
        setField(term287026, term287026.getClass(), "lastRegionId", null);
        setField(term287026, term287026.getClass(), "lastRegionName", null);
        setField(term287026, term287026.getClass(), "lastAllNetId", null);
        setField(term287026, term287026.getClass(), "lastClientId", null);
        setField(term287026, term287026.getClass(), "lastCountryCode", null);
        setField(term287026, term287026.getClass(), "userNameEx", null);
        setField(term287026, term287026.getClass(), "compatibleCmVersion", null);
        setIntField(term287026, term287026.getClass(), "medal", 0);
        setIntField(term287026, term287026.getClass(), "mapIconId", 0);
        setIntField(term287026, term287026.getClass(), "voiceId", 0);
        setIntField(term287026, term287026.getClass(), "avatarWear", 0);
        setIntField(term287026, term287026.getClass(), "avatarHead", 0);
        setIntField(term287026, term287026.getClass(), "avatarFace", 0);
        setIntField(term287026, term287026.getClass(), "avatarSkin", 0);
        setIntField(term287026, term287026.getClass(), "avatarItem", 0);
        setIntField(term287026, term287026.getClass(), "avatarFront", 0);
        setIntField(term287026, term287026.getClass(), "avatarBack", 0);
        setIntField(term287026, term287026.getClass(), "classEmblemBase", 0);
        setIntField(term287026, term287026.getClass(), "classEmblemMedal", 0);
        setIntField(term287026, term287026.getClass(), "stockedGridCount", 0);
        setIntField(term287026, term287026.getClass(), "exMapLoopCount", 0);
        setIntField(term287026, term287026.getClass(), "netBattlePlayCount", 0);
        setIntField(term287026, term287026.getClass(), "netBattleWinCount", 0);
        setIntField(term287026, term287026.getClass(), "netBattleLoseCount", 0);
        setIntField(term287026, term287026.getClass(), "netBattleConsecutiveWinCount", 0);
        setIntField(term287026, term287026.getClass(), "charaIllustId", 0);
        setIntField(term287026, term287026.getClass(), "skillId", 0);
        setIntField(term287026, term287026.getClass(), "overPowerPoint", 0);
        setIntField(term287026, term287026.getClass(), "overPowerRate", 0);
        setIntField(term287026, term287026.getClass(), "overPowerLowerRank", 0);
        setIntField(term287026, term287026.getClass(), "avatarPoint", 0);
        setIntField(term287026, term287026.getClass(), "battleRankId", 0);
        setIntField(term287026, term287026.getClass(), "battleRankPoint", 0);
        setIntField(term287026, term287026.getClass(), "eliteRankPoint", 0);
        setIntField(term287026, term287026.getClass(), "netBattle1stCount", 0);
        setIntField(term287026, term287026.getClass(), "netBattle2ndCount", 0);
        setIntField(term287026, term287026.getClass(), "netBattle3rdCount", 0);
        setIntField(term287026, term287026.getClass(), "netBattle4thCount", 0);
        setIntField(term287026, term287026.getClass(), "netBattleCorrection", 0);
        setIntField(term287026, term287026.getClass(), "netBattleErrCnt", 0);
        setIntField(term287026, term287026.getClass(), "netBattleHostErrCnt", 0);
        setIntField(term287026, term287026.getClass(), "battleRewardStatus", 0);
        setIntField(term287026, term287026.getClass(), "battleRewardIndex", 0);
        setIntField(term287026, term287026.getClass(), "battleRewardCount", 0);
        setIntField(term287026, term287026.getClass(), "ext1", 0);
        setIntField(term287026, term287026.getClass(), "ext2", 0);
        setIntField(term287026, term287026.getClass(), "ext3", 0);
        setIntField(term287026, term287026.getClass(), "ext4", 0);
        setIntField(term287026, term287026.getClass(), "ext5", 0);
        setIntField(term287026, term287026.getClass(), "ext6", 0);
        setIntField(term287026, term287026.getClass(), "ext7", 0);
        setIntField(term287026, term287026.getClass(), "ext8", 0);
        setIntField(term287026, term287026.getClass(), "ext9", 0);
        setIntField(term287026, term287026.getClass(), "ext10", 0);
        setField(term287026, term287026.getClass(), "extStr1", null);
        setField(term287026, term287026.getClass(), "extStr2", null);
        setLongField(term287026, term287026.getClass(), "extLong1", 0L);
        setLongField(term287026, term287026.getClass(), "extLong2", 0L);
        setField(term287026, term287026.getClass(), "rankUpChallengeResults", null);
        setBooleanField(term287026, term287026.getClass(), "isNetBattleHost", false);
        setIntField(term287026, term287026.getClass(), "netBattleEndState", 0);
        term287103 = new Long(0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term287103;
        callMethod(klass, "setTotalMasterHighScore", argTypes, term287026, args);
    }

};


