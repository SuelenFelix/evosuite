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

public class UserData_setNetBattle1stCount_1307527905379 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term290861;
     Object term290938;

    public UserData_setNetBattle1stCount_1307527905379() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term290861 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserData"));
        setLongField(term290861, term290861.getClass(), "id", 0L);
        setField(term290861, term290861.getClass(), "card", null);
        setField(term290861, term290861.getClass(), "userName", null);
        setIntField(term290861, term290861.getClass(), "level", 0);
        setIntField(term290861, term290861.getClass(), "reincarnationNum", 0);
        setField(term290861, term290861.getClass(), "exp", null);
        setLongField(term290861, term290861.getClass(), "point", 0L);
        setLongField(term290861, term290861.getClass(), "totalPoint", 0L);
        setIntField(term290861, term290861.getClass(), "playCount", 0);
        setIntField(term290861, term290861.getClass(), "multiPlayCount", 0);
        setIntField(term290861, term290861.getClass(), "playerRating", 0);
        setIntField(term290861, term290861.getClass(), "highestRating", 0);
        setIntField(term290861, term290861.getClass(), "nameplateId", 0);
        setIntField(term290861, term290861.getClass(), "frameId", 0);
        setIntField(term290861, term290861.getClass(), "characterId", 0);
        setIntField(term290861, term290861.getClass(), "trophyId", 0);
        setIntField(term290861, term290861.getClass(), "playedTutorialBit", 0);
        setIntField(term290861, term290861.getClass(), "firstTutorialCancelNum", 0);
        setIntField(term290861, term290861.getClass(), "masterTutorialCancelNum", 0);
        setIntField(term290861, term290861.getClass(), "totalMapNum", 0);
        setLongField(term290861, term290861.getClass(), "totalHiScore", 0L);
        setLongField(term290861, term290861.getClass(), "totalBasicHighScore", 0L);
        setLongField(term290861, term290861.getClass(), "totalAdvancedHighScore", 0L);
        setLongField(term290861, term290861.getClass(), "totalExpertHighScore", 0L);
        setLongField(term290861, term290861.getClass(), "totalMasterHighScore", 0L);
        setLongField(term290861, term290861.getClass(), "totalUltimaHighScore", 0L);
        setField(term290861, term290861.getClass(), "eventWatchedDate", null);
        setIntField(term290861, term290861.getClass(), "friendCount", 0);
        setField(term290861, term290861.getClass(), "firstGameId", null);
        setField(term290861, term290861.getClass(), "firstRomVersion", null);
        setField(term290861, term290861.getClass(), "firstDataVersion", null);
        setField(term290861, term290861.getClass(), "firstPlayDate", null);
        setField(term290861, term290861.getClass(), "lastGameId", null);
        setField(term290861, term290861.getClass(), "lastRomVersion", null);
        setField(term290861, term290861.getClass(), "lastDataVersion", null);
        setField(term290861, term290861.getClass(), "lastLoginDate", null);
        setField(term290861, term290861.getClass(), "lastPlayDate", null);
        setIntField(term290861, term290861.getClass(), "lastPlaceId", 0);
        setField(term290861, term290861.getClass(), "lastPlaceName", null);
        setField(term290861, term290861.getClass(), "lastRegionId", null);
        setField(term290861, term290861.getClass(), "lastRegionName", null);
        setField(term290861, term290861.getClass(), "lastAllNetId", null);
        setField(term290861, term290861.getClass(), "lastClientId", null);
        setField(term290861, term290861.getClass(), "lastCountryCode", null);
        setField(term290861, term290861.getClass(), "userNameEx", null);
        setField(term290861, term290861.getClass(), "compatibleCmVersion", null);
        setIntField(term290861, term290861.getClass(), "medal", 0);
        setIntField(term290861, term290861.getClass(), "mapIconId", 0);
        setIntField(term290861, term290861.getClass(), "voiceId", 0);
        setIntField(term290861, term290861.getClass(), "avatarWear", 0);
        setIntField(term290861, term290861.getClass(), "avatarHead", 0);
        setIntField(term290861, term290861.getClass(), "avatarFace", 0);
        setIntField(term290861, term290861.getClass(), "avatarSkin", 0);
        setIntField(term290861, term290861.getClass(), "avatarItem", 0);
        setIntField(term290861, term290861.getClass(), "avatarFront", 0);
        setIntField(term290861, term290861.getClass(), "avatarBack", 0);
        setIntField(term290861, term290861.getClass(), "classEmblemBase", 0);
        setIntField(term290861, term290861.getClass(), "classEmblemMedal", 0);
        setIntField(term290861, term290861.getClass(), "stockedGridCount", 0);
        setIntField(term290861, term290861.getClass(), "exMapLoopCount", 0);
        setIntField(term290861, term290861.getClass(), "netBattlePlayCount", 0);
        setIntField(term290861, term290861.getClass(), "netBattleWinCount", 0);
        setIntField(term290861, term290861.getClass(), "netBattleLoseCount", 0);
        setIntField(term290861, term290861.getClass(), "netBattleConsecutiveWinCount", 0);
        setIntField(term290861, term290861.getClass(), "charaIllustId", 0);
        setIntField(term290861, term290861.getClass(), "skillId", 0);
        setIntField(term290861, term290861.getClass(), "overPowerPoint", 0);
        setIntField(term290861, term290861.getClass(), "overPowerRate", 0);
        setIntField(term290861, term290861.getClass(), "overPowerLowerRank", 0);
        setIntField(term290861, term290861.getClass(), "avatarPoint", 0);
        setIntField(term290861, term290861.getClass(), "battleRankId", 0);
        setIntField(term290861, term290861.getClass(), "battleRankPoint", 0);
        setIntField(term290861, term290861.getClass(), "eliteRankPoint", 0);
        setIntField(term290861, term290861.getClass(), "netBattle1stCount", 0);
        setIntField(term290861, term290861.getClass(), "netBattle2ndCount", 0);
        setIntField(term290861, term290861.getClass(), "netBattle3rdCount", 0);
        setIntField(term290861, term290861.getClass(), "netBattle4thCount", 0);
        setIntField(term290861, term290861.getClass(), "netBattleCorrection", 0);
        setIntField(term290861, term290861.getClass(), "netBattleErrCnt", 0);
        setIntField(term290861, term290861.getClass(), "netBattleHostErrCnt", 0);
        setIntField(term290861, term290861.getClass(), "battleRewardStatus", 0);
        setIntField(term290861, term290861.getClass(), "battleRewardIndex", 0);
        setIntField(term290861, term290861.getClass(), "battleRewardCount", 0);
        setIntField(term290861, term290861.getClass(), "ext1", 0);
        setIntField(term290861, term290861.getClass(), "ext2", 0);
        setIntField(term290861, term290861.getClass(), "ext3", 0);
        setIntField(term290861, term290861.getClass(), "ext4", 0);
        setIntField(term290861, term290861.getClass(), "ext5", 0);
        setIntField(term290861, term290861.getClass(), "ext6", 0);
        setIntField(term290861, term290861.getClass(), "ext7", 0);
        setIntField(term290861, term290861.getClass(), "ext8", 0);
        setIntField(term290861, term290861.getClass(), "ext9", 0);
        setIntField(term290861, term290861.getClass(), "ext10", 0);
        setField(term290861, term290861.getClass(), "extStr1", null);
        setField(term290861, term290861.getClass(), "extStr2", null);
        setLongField(term290861, term290861.getClass(), "extLong1", 0L);
        setLongField(term290861, term290861.getClass(), "extLong2", 0L);
        setField(term290861, term290861.getClass(), "rankUpChallengeResults", null);
        setBooleanField(term290861, term290861.getClass(), "isNetBattleHost", false);
        setIntField(term290861, term290861.getClass(), "netBattleEndState", 0);
        term290938 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term290938;
        callMethod(klass, "setNetBattle1stCount", argTypes, term290861, args);
    }

};


