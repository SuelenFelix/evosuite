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

public class UserData_setOverPowerLowerRank_419921523374 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term290466;
     Object term290543;

    public UserData_setOverPowerLowerRank_419921523374() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term290466 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserData"));
        setLongField(term290466, term290466.getClass(), "id", 0L);
        setField(term290466, term290466.getClass(), "card", null);
        setField(term290466, term290466.getClass(), "userName", null);
        setIntField(term290466, term290466.getClass(), "level", 0);
        setIntField(term290466, term290466.getClass(), "reincarnationNum", 0);
        setField(term290466, term290466.getClass(), "exp", null);
        setLongField(term290466, term290466.getClass(), "point", 0L);
        setLongField(term290466, term290466.getClass(), "totalPoint", 0L);
        setIntField(term290466, term290466.getClass(), "playCount", 0);
        setIntField(term290466, term290466.getClass(), "multiPlayCount", 0);
        setIntField(term290466, term290466.getClass(), "playerRating", 0);
        setIntField(term290466, term290466.getClass(), "highestRating", 0);
        setIntField(term290466, term290466.getClass(), "nameplateId", 0);
        setIntField(term290466, term290466.getClass(), "frameId", 0);
        setIntField(term290466, term290466.getClass(), "characterId", 0);
        setIntField(term290466, term290466.getClass(), "trophyId", 0);
        setIntField(term290466, term290466.getClass(), "playedTutorialBit", 0);
        setIntField(term290466, term290466.getClass(), "firstTutorialCancelNum", 0);
        setIntField(term290466, term290466.getClass(), "masterTutorialCancelNum", 0);
        setIntField(term290466, term290466.getClass(), "totalMapNum", 0);
        setLongField(term290466, term290466.getClass(), "totalHiScore", 0L);
        setLongField(term290466, term290466.getClass(), "totalBasicHighScore", 0L);
        setLongField(term290466, term290466.getClass(), "totalAdvancedHighScore", 0L);
        setLongField(term290466, term290466.getClass(), "totalExpertHighScore", 0L);
        setLongField(term290466, term290466.getClass(), "totalMasterHighScore", 0L);
        setLongField(term290466, term290466.getClass(), "totalUltimaHighScore", 0L);
        setField(term290466, term290466.getClass(), "eventWatchedDate", null);
        setIntField(term290466, term290466.getClass(), "friendCount", 0);
        setField(term290466, term290466.getClass(), "firstGameId", null);
        setField(term290466, term290466.getClass(), "firstRomVersion", null);
        setField(term290466, term290466.getClass(), "firstDataVersion", null);
        setField(term290466, term290466.getClass(), "firstPlayDate", null);
        setField(term290466, term290466.getClass(), "lastGameId", null);
        setField(term290466, term290466.getClass(), "lastRomVersion", null);
        setField(term290466, term290466.getClass(), "lastDataVersion", null);
        setField(term290466, term290466.getClass(), "lastLoginDate", null);
        setField(term290466, term290466.getClass(), "lastPlayDate", null);
        setIntField(term290466, term290466.getClass(), "lastPlaceId", 0);
        setField(term290466, term290466.getClass(), "lastPlaceName", null);
        setField(term290466, term290466.getClass(), "lastRegionId", null);
        setField(term290466, term290466.getClass(), "lastRegionName", null);
        setField(term290466, term290466.getClass(), "lastAllNetId", null);
        setField(term290466, term290466.getClass(), "lastClientId", null);
        setField(term290466, term290466.getClass(), "lastCountryCode", null);
        setField(term290466, term290466.getClass(), "userNameEx", null);
        setField(term290466, term290466.getClass(), "compatibleCmVersion", null);
        setIntField(term290466, term290466.getClass(), "medal", 0);
        setIntField(term290466, term290466.getClass(), "mapIconId", 0);
        setIntField(term290466, term290466.getClass(), "voiceId", 0);
        setIntField(term290466, term290466.getClass(), "avatarWear", 0);
        setIntField(term290466, term290466.getClass(), "avatarHead", 0);
        setIntField(term290466, term290466.getClass(), "avatarFace", 0);
        setIntField(term290466, term290466.getClass(), "avatarSkin", 0);
        setIntField(term290466, term290466.getClass(), "avatarItem", 0);
        setIntField(term290466, term290466.getClass(), "avatarFront", 0);
        setIntField(term290466, term290466.getClass(), "avatarBack", 0);
        setIntField(term290466, term290466.getClass(), "classEmblemBase", 0);
        setIntField(term290466, term290466.getClass(), "classEmblemMedal", 0);
        setIntField(term290466, term290466.getClass(), "stockedGridCount", 0);
        setIntField(term290466, term290466.getClass(), "exMapLoopCount", 0);
        setIntField(term290466, term290466.getClass(), "netBattlePlayCount", 0);
        setIntField(term290466, term290466.getClass(), "netBattleWinCount", 0);
        setIntField(term290466, term290466.getClass(), "netBattleLoseCount", 0);
        setIntField(term290466, term290466.getClass(), "netBattleConsecutiveWinCount", 0);
        setIntField(term290466, term290466.getClass(), "charaIllustId", 0);
        setIntField(term290466, term290466.getClass(), "skillId", 0);
        setIntField(term290466, term290466.getClass(), "overPowerPoint", 0);
        setIntField(term290466, term290466.getClass(), "overPowerRate", 0);
        setIntField(term290466, term290466.getClass(), "overPowerLowerRank", 0);
        setIntField(term290466, term290466.getClass(), "avatarPoint", 0);
        setIntField(term290466, term290466.getClass(), "battleRankId", 0);
        setIntField(term290466, term290466.getClass(), "battleRankPoint", 0);
        setIntField(term290466, term290466.getClass(), "eliteRankPoint", 0);
        setIntField(term290466, term290466.getClass(), "netBattle1stCount", 0);
        setIntField(term290466, term290466.getClass(), "netBattle2ndCount", 0);
        setIntField(term290466, term290466.getClass(), "netBattle3rdCount", 0);
        setIntField(term290466, term290466.getClass(), "netBattle4thCount", 0);
        setIntField(term290466, term290466.getClass(), "netBattleCorrection", 0);
        setIntField(term290466, term290466.getClass(), "netBattleErrCnt", 0);
        setIntField(term290466, term290466.getClass(), "netBattleHostErrCnt", 0);
        setIntField(term290466, term290466.getClass(), "battleRewardStatus", 0);
        setIntField(term290466, term290466.getClass(), "battleRewardIndex", 0);
        setIntField(term290466, term290466.getClass(), "battleRewardCount", 0);
        setIntField(term290466, term290466.getClass(), "ext1", 0);
        setIntField(term290466, term290466.getClass(), "ext2", 0);
        setIntField(term290466, term290466.getClass(), "ext3", 0);
        setIntField(term290466, term290466.getClass(), "ext4", 0);
        setIntField(term290466, term290466.getClass(), "ext5", 0);
        setIntField(term290466, term290466.getClass(), "ext6", 0);
        setIntField(term290466, term290466.getClass(), "ext7", 0);
        setIntField(term290466, term290466.getClass(), "ext8", 0);
        setIntField(term290466, term290466.getClass(), "ext9", 0);
        setIntField(term290466, term290466.getClass(), "ext10", 0);
        setField(term290466, term290466.getClass(), "extStr1", null);
        setField(term290466, term290466.getClass(), "extStr2", null);
        setLongField(term290466, term290466.getClass(), "extLong1", 0L);
        setLongField(term290466, term290466.getClass(), "extLong2", 0L);
        setField(term290466, term290466.getClass(), "rankUpChallengeResults", null);
        setBooleanField(term290466, term290466.getClass(), "isNetBattleHost", false);
        setIntField(term290466, term290466.getClass(), "netBattleEndState", 0);
        term290543 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term290543;
        callMethod(klass, "setOverPowerLowerRank", argTypes, term290466, args);
    }

};


