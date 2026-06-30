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

public class UserData_setNetBattleErrCnt_381364186384 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term291256;
     Object term291333;

    public UserData_setNetBattleErrCnt_381364186384() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term291256 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserData"));
        setLongField(term291256, term291256.getClass(), "id", 0L);
        setField(term291256, term291256.getClass(), "card", null);
        setField(term291256, term291256.getClass(), "userName", null);
        setIntField(term291256, term291256.getClass(), "level", 0);
        setIntField(term291256, term291256.getClass(), "reincarnationNum", 0);
        setField(term291256, term291256.getClass(), "exp", null);
        setLongField(term291256, term291256.getClass(), "point", 0L);
        setLongField(term291256, term291256.getClass(), "totalPoint", 0L);
        setIntField(term291256, term291256.getClass(), "playCount", 0);
        setIntField(term291256, term291256.getClass(), "multiPlayCount", 0);
        setIntField(term291256, term291256.getClass(), "playerRating", 0);
        setIntField(term291256, term291256.getClass(), "highestRating", 0);
        setIntField(term291256, term291256.getClass(), "nameplateId", 0);
        setIntField(term291256, term291256.getClass(), "frameId", 0);
        setIntField(term291256, term291256.getClass(), "characterId", 0);
        setIntField(term291256, term291256.getClass(), "trophyId", 0);
        setIntField(term291256, term291256.getClass(), "playedTutorialBit", 0);
        setIntField(term291256, term291256.getClass(), "firstTutorialCancelNum", 0);
        setIntField(term291256, term291256.getClass(), "masterTutorialCancelNum", 0);
        setIntField(term291256, term291256.getClass(), "totalMapNum", 0);
        setLongField(term291256, term291256.getClass(), "totalHiScore", 0L);
        setLongField(term291256, term291256.getClass(), "totalBasicHighScore", 0L);
        setLongField(term291256, term291256.getClass(), "totalAdvancedHighScore", 0L);
        setLongField(term291256, term291256.getClass(), "totalExpertHighScore", 0L);
        setLongField(term291256, term291256.getClass(), "totalMasterHighScore", 0L);
        setLongField(term291256, term291256.getClass(), "totalUltimaHighScore", 0L);
        setField(term291256, term291256.getClass(), "eventWatchedDate", null);
        setIntField(term291256, term291256.getClass(), "friendCount", 0);
        setField(term291256, term291256.getClass(), "firstGameId", null);
        setField(term291256, term291256.getClass(), "firstRomVersion", null);
        setField(term291256, term291256.getClass(), "firstDataVersion", null);
        setField(term291256, term291256.getClass(), "firstPlayDate", null);
        setField(term291256, term291256.getClass(), "lastGameId", null);
        setField(term291256, term291256.getClass(), "lastRomVersion", null);
        setField(term291256, term291256.getClass(), "lastDataVersion", null);
        setField(term291256, term291256.getClass(), "lastLoginDate", null);
        setField(term291256, term291256.getClass(), "lastPlayDate", null);
        setIntField(term291256, term291256.getClass(), "lastPlaceId", 0);
        setField(term291256, term291256.getClass(), "lastPlaceName", null);
        setField(term291256, term291256.getClass(), "lastRegionId", null);
        setField(term291256, term291256.getClass(), "lastRegionName", null);
        setField(term291256, term291256.getClass(), "lastAllNetId", null);
        setField(term291256, term291256.getClass(), "lastClientId", null);
        setField(term291256, term291256.getClass(), "lastCountryCode", null);
        setField(term291256, term291256.getClass(), "userNameEx", null);
        setField(term291256, term291256.getClass(), "compatibleCmVersion", null);
        setIntField(term291256, term291256.getClass(), "medal", 0);
        setIntField(term291256, term291256.getClass(), "mapIconId", 0);
        setIntField(term291256, term291256.getClass(), "voiceId", 0);
        setIntField(term291256, term291256.getClass(), "avatarWear", 0);
        setIntField(term291256, term291256.getClass(), "avatarHead", 0);
        setIntField(term291256, term291256.getClass(), "avatarFace", 0);
        setIntField(term291256, term291256.getClass(), "avatarSkin", 0);
        setIntField(term291256, term291256.getClass(), "avatarItem", 0);
        setIntField(term291256, term291256.getClass(), "avatarFront", 0);
        setIntField(term291256, term291256.getClass(), "avatarBack", 0);
        setIntField(term291256, term291256.getClass(), "classEmblemBase", 0);
        setIntField(term291256, term291256.getClass(), "classEmblemMedal", 0);
        setIntField(term291256, term291256.getClass(), "stockedGridCount", 0);
        setIntField(term291256, term291256.getClass(), "exMapLoopCount", 0);
        setIntField(term291256, term291256.getClass(), "netBattlePlayCount", 0);
        setIntField(term291256, term291256.getClass(), "netBattleWinCount", 0);
        setIntField(term291256, term291256.getClass(), "netBattleLoseCount", 0);
        setIntField(term291256, term291256.getClass(), "netBattleConsecutiveWinCount", 0);
        setIntField(term291256, term291256.getClass(), "charaIllustId", 0);
        setIntField(term291256, term291256.getClass(), "skillId", 0);
        setIntField(term291256, term291256.getClass(), "overPowerPoint", 0);
        setIntField(term291256, term291256.getClass(), "overPowerRate", 0);
        setIntField(term291256, term291256.getClass(), "overPowerLowerRank", 0);
        setIntField(term291256, term291256.getClass(), "avatarPoint", 0);
        setIntField(term291256, term291256.getClass(), "battleRankId", 0);
        setIntField(term291256, term291256.getClass(), "battleRankPoint", 0);
        setIntField(term291256, term291256.getClass(), "eliteRankPoint", 0);
        setIntField(term291256, term291256.getClass(), "netBattle1stCount", 0);
        setIntField(term291256, term291256.getClass(), "netBattle2ndCount", 0);
        setIntField(term291256, term291256.getClass(), "netBattle3rdCount", 0);
        setIntField(term291256, term291256.getClass(), "netBattle4thCount", 0);
        setIntField(term291256, term291256.getClass(), "netBattleCorrection", 0);
        setIntField(term291256, term291256.getClass(), "netBattleErrCnt", 0);
        setIntField(term291256, term291256.getClass(), "netBattleHostErrCnt", 0);
        setIntField(term291256, term291256.getClass(), "battleRewardStatus", 0);
        setIntField(term291256, term291256.getClass(), "battleRewardIndex", 0);
        setIntField(term291256, term291256.getClass(), "battleRewardCount", 0);
        setIntField(term291256, term291256.getClass(), "ext1", 0);
        setIntField(term291256, term291256.getClass(), "ext2", 0);
        setIntField(term291256, term291256.getClass(), "ext3", 0);
        setIntField(term291256, term291256.getClass(), "ext4", 0);
        setIntField(term291256, term291256.getClass(), "ext5", 0);
        setIntField(term291256, term291256.getClass(), "ext6", 0);
        setIntField(term291256, term291256.getClass(), "ext7", 0);
        setIntField(term291256, term291256.getClass(), "ext8", 0);
        setIntField(term291256, term291256.getClass(), "ext9", 0);
        setIntField(term291256, term291256.getClass(), "ext10", 0);
        setField(term291256, term291256.getClass(), "extStr1", null);
        setField(term291256, term291256.getClass(), "extStr2", null);
        setLongField(term291256, term291256.getClass(), "extLong1", 0L);
        setLongField(term291256, term291256.getClass(), "extLong2", 0L);
        setField(term291256, term291256.getClass(), "rankUpChallengeResults", null);
        setBooleanField(term291256, term291256.getClass(), "isNetBattleHost", false);
        setIntField(term291256, term291256.getClass(), "netBattleEndState", 0);
        term291333 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term291333;
        callMethod(klass, "setNetBattleErrCnt", argTypes, term291256, args);
    }

};


