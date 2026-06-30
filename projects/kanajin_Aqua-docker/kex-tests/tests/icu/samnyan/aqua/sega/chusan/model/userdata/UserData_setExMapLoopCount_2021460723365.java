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

public class UserData_setExMapLoopCount_2021460723365 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term289755;
     Object term289832;

    public UserData_setExMapLoopCount_2021460723365() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term289755 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserData"));
        setLongField(term289755, term289755.getClass(), "id", 0L);
        setField(term289755, term289755.getClass(), "card", null);
        setField(term289755, term289755.getClass(), "userName", null);
        setIntField(term289755, term289755.getClass(), "level", 0);
        setIntField(term289755, term289755.getClass(), "reincarnationNum", 0);
        setField(term289755, term289755.getClass(), "exp", null);
        setLongField(term289755, term289755.getClass(), "point", 0L);
        setLongField(term289755, term289755.getClass(), "totalPoint", 0L);
        setIntField(term289755, term289755.getClass(), "playCount", 0);
        setIntField(term289755, term289755.getClass(), "multiPlayCount", 0);
        setIntField(term289755, term289755.getClass(), "playerRating", 0);
        setIntField(term289755, term289755.getClass(), "highestRating", 0);
        setIntField(term289755, term289755.getClass(), "nameplateId", 0);
        setIntField(term289755, term289755.getClass(), "frameId", 0);
        setIntField(term289755, term289755.getClass(), "characterId", 0);
        setIntField(term289755, term289755.getClass(), "trophyId", 0);
        setIntField(term289755, term289755.getClass(), "playedTutorialBit", 0);
        setIntField(term289755, term289755.getClass(), "firstTutorialCancelNum", 0);
        setIntField(term289755, term289755.getClass(), "masterTutorialCancelNum", 0);
        setIntField(term289755, term289755.getClass(), "totalMapNum", 0);
        setLongField(term289755, term289755.getClass(), "totalHiScore", 0L);
        setLongField(term289755, term289755.getClass(), "totalBasicHighScore", 0L);
        setLongField(term289755, term289755.getClass(), "totalAdvancedHighScore", 0L);
        setLongField(term289755, term289755.getClass(), "totalExpertHighScore", 0L);
        setLongField(term289755, term289755.getClass(), "totalMasterHighScore", 0L);
        setLongField(term289755, term289755.getClass(), "totalUltimaHighScore", 0L);
        setField(term289755, term289755.getClass(), "eventWatchedDate", null);
        setIntField(term289755, term289755.getClass(), "friendCount", 0);
        setField(term289755, term289755.getClass(), "firstGameId", null);
        setField(term289755, term289755.getClass(), "firstRomVersion", null);
        setField(term289755, term289755.getClass(), "firstDataVersion", null);
        setField(term289755, term289755.getClass(), "firstPlayDate", null);
        setField(term289755, term289755.getClass(), "lastGameId", null);
        setField(term289755, term289755.getClass(), "lastRomVersion", null);
        setField(term289755, term289755.getClass(), "lastDataVersion", null);
        setField(term289755, term289755.getClass(), "lastLoginDate", null);
        setField(term289755, term289755.getClass(), "lastPlayDate", null);
        setIntField(term289755, term289755.getClass(), "lastPlaceId", 0);
        setField(term289755, term289755.getClass(), "lastPlaceName", null);
        setField(term289755, term289755.getClass(), "lastRegionId", null);
        setField(term289755, term289755.getClass(), "lastRegionName", null);
        setField(term289755, term289755.getClass(), "lastAllNetId", null);
        setField(term289755, term289755.getClass(), "lastClientId", null);
        setField(term289755, term289755.getClass(), "lastCountryCode", null);
        setField(term289755, term289755.getClass(), "userNameEx", null);
        setField(term289755, term289755.getClass(), "compatibleCmVersion", null);
        setIntField(term289755, term289755.getClass(), "medal", 0);
        setIntField(term289755, term289755.getClass(), "mapIconId", 0);
        setIntField(term289755, term289755.getClass(), "voiceId", 0);
        setIntField(term289755, term289755.getClass(), "avatarWear", 0);
        setIntField(term289755, term289755.getClass(), "avatarHead", 0);
        setIntField(term289755, term289755.getClass(), "avatarFace", 0);
        setIntField(term289755, term289755.getClass(), "avatarSkin", 0);
        setIntField(term289755, term289755.getClass(), "avatarItem", 0);
        setIntField(term289755, term289755.getClass(), "avatarFront", 0);
        setIntField(term289755, term289755.getClass(), "avatarBack", 0);
        setIntField(term289755, term289755.getClass(), "classEmblemBase", 0);
        setIntField(term289755, term289755.getClass(), "classEmblemMedal", 0);
        setIntField(term289755, term289755.getClass(), "stockedGridCount", 0);
        setIntField(term289755, term289755.getClass(), "exMapLoopCount", 0);
        setIntField(term289755, term289755.getClass(), "netBattlePlayCount", 0);
        setIntField(term289755, term289755.getClass(), "netBattleWinCount", 0);
        setIntField(term289755, term289755.getClass(), "netBattleLoseCount", 0);
        setIntField(term289755, term289755.getClass(), "netBattleConsecutiveWinCount", 0);
        setIntField(term289755, term289755.getClass(), "charaIllustId", 0);
        setIntField(term289755, term289755.getClass(), "skillId", 0);
        setIntField(term289755, term289755.getClass(), "overPowerPoint", 0);
        setIntField(term289755, term289755.getClass(), "overPowerRate", 0);
        setIntField(term289755, term289755.getClass(), "overPowerLowerRank", 0);
        setIntField(term289755, term289755.getClass(), "avatarPoint", 0);
        setIntField(term289755, term289755.getClass(), "battleRankId", 0);
        setIntField(term289755, term289755.getClass(), "battleRankPoint", 0);
        setIntField(term289755, term289755.getClass(), "eliteRankPoint", 0);
        setIntField(term289755, term289755.getClass(), "netBattle1stCount", 0);
        setIntField(term289755, term289755.getClass(), "netBattle2ndCount", 0);
        setIntField(term289755, term289755.getClass(), "netBattle3rdCount", 0);
        setIntField(term289755, term289755.getClass(), "netBattle4thCount", 0);
        setIntField(term289755, term289755.getClass(), "netBattleCorrection", 0);
        setIntField(term289755, term289755.getClass(), "netBattleErrCnt", 0);
        setIntField(term289755, term289755.getClass(), "netBattleHostErrCnt", 0);
        setIntField(term289755, term289755.getClass(), "battleRewardStatus", 0);
        setIntField(term289755, term289755.getClass(), "battleRewardIndex", 0);
        setIntField(term289755, term289755.getClass(), "battleRewardCount", 0);
        setIntField(term289755, term289755.getClass(), "ext1", 0);
        setIntField(term289755, term289755.getClass(), "ext2", 0);
        setIntField(term289755, term289755.getClass(), "ext3", 0);
        setIntField(term289755, term289755.getClass(), "ext4", 0);
        setIntField(term289755, term289755.getClass(), "ext5", 0);
        setIntField(term289755, term289755.getClass(), "ext6", 0);
        setIntField(term289755, term289755.getClass(), "ext7", 0);
        setIntField(term289755, term289755.getClass(), "ext8", 0);
        setIntField(term289755, term289755.getClass(), "ext9", 0);
        setIntField(term289755, term289755.getClass(), "ext10", 0);
        setField(term289755, term289755.getClass(), "extStr1", null);
        setField(term289755, term289755.getClass(), "extStr2", null);
        setLongField(term289755, term289755.getClass(), "extLong1", 0L);
        setLongField(term289755, term289755.getClass(), "extLong2", 0L);
        setField(term289755, term289755.getClass(), "rankUpChallengeResults", null);
        setBooleanField(term289755, term289755.getClass(), "isNetBattleHost", false);
        setIntField(term289755, term289755.getClass(), "netBattleEndState", 0);
        term289832 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term289832;
        callMethod(klass, "setExMapLoopCount", argTypes, term289755, args);
    }

};


