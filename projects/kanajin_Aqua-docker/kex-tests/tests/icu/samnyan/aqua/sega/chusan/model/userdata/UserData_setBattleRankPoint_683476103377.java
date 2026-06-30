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

public class UserData_setBattleRankPoint_683476103377 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term290703;
     Object term290780;

    public UserData_setBattleRankPoint_683476103377() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term290703 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserData"));
        setLongField(term290703, term290703.getClass(), "id", 0L);
        setField(term290703, term290703.getClass(), "card", null);
        setField(term290703, term290703.getClass(), "userName", null);
        setIntField(term290703, term290703.getClass(), "level", 0);
        setIntField(term290703, term290703.getClass(), "reincarnationNum", 0);
        setField(term290703, term290703.getClass(), "exp", null);
        setLongField(term290703, term290703.getClass(), "point", 0L);
        setLongField(term290703, term290703.getClass(), "totalPoint", 0L);
        setIntField(term290703, term290703.getClass(), "playCount", 0);
        setIntField(term290703, term290703.getClass(), "multiPlayCount", 0);
        setIntField(term290703, term290703.getClass(), "playerRating", 0);
        setIntField(term290703, term290703.getClass(), "highestRating", 0);
        setIntField(term290703, term290703.getClass(), "nameplateId", 0);
        setIntField(term290703, term290703.getClass(), "frameId", 0);
        setIntField(term290703, term290703.getClass(), "characterId", 0);
        setIntField(term290703, term290703.getClass(), "trophyId", 0);
        setIntField(term290703, term290703.getClass(), "playedTutorialBit", 0);
        setIntField(term290703, term290703.getClass(), "firstTutorialCancelNum", 0);
        setIntField(term290703, term290703.getClass(), "masterTutorialCancelNum", 0);
        setIntField(term290703, term290703.getClass(), "totalMapNum", 0);
        setLongField(term290703, term290703.getClass(), "totalHiScore", 0L);
        setLongField(term290703, term290703.getClass(), "totalBasicHighScore", 0L);
        setLongField(term290703, term290703.getClass(), "totalAdvancedHighScore", 0L);
        setLongField(term290703, term290703.getClass(), "totalExpertHighScore", 0L);
        setLongField(term290703, term290703.getClass(), "totalMasterHighScore", 0L);
        setLongField(term290703, term290703.getClass(), "totalUltimaHighScore", 0L);
        setField(term290703, term290703.getClass(), "eventWatchedDate", null);
        setIntField(term290703, term290703.getClass(), "friendCount", 0);
        setField(term290703, term290703.getClass(), "firstGameId", null);
        setField(term290703, term290703.getClass(), "firstRomVersion", null);
        setField(term290703, term290703.getClass(), "firstDataVersion", null);
        setField(term290703, term290703.getClass(), "firstPlayDate", null);
        setField(term290703, term290703.getClass(), "lastGameId", null);
        setField(term290703, term290703.getClass(), "lastRomVersion", null);
        setField(term290703, term290703.getClass(), "lastDataVersion", null);
        setField(term290703, term290703.getClass(), "lastLoginDate", null);
        setField(term290703, term290703.getClass(), "lastPlayDate", null);
        setIntField(term290703, term290703.getClass(), "lastPlaceId", 0);
        setField(term290703, term290703.getClass(), "lastPlaceName", null);
        setField(term290703, term290703.getClass(), "lastRegionId", null);
        setField(term290703, term290703.getClass(), "lastRegionName", null);
        setField(term290703, term290703.getClass(), "lastAllNetId", null);
        setField(term290703, term290703.getClass(), "lastClientId", null);
        setField(term290703, term290703.getClass(), "lastCountryCode", null);
        setField(term290703, term290703.getClass(), "userNameEx", null);
        setField(term290703, term290703.getClass(), "compatibleCmVersion", null);
        setIntField(term290703, term290703.getClass(), "medal", 0);
        setIntField(term290703, term290703.getClass(), "mapIconId", 0);
        setIntField(term290703, term290703.getClass(), "voiceId", 0);
        setIntField(term290703, term290703.getClass(), "avatarWear", 0);
        setIntField(term290703, term290703.getClass(), "avatarHead", 0);
        setIntField(term290703, term290703.getClass(), "avatarFace", 0);
        setIntField(term290703, term290703.getClass(), "avatarSkin", 0);
        setIntField(term290703, term290703.getClass(), "avatarItem", 0);
        setIntField(term290703, term290703.getClass(), "avatarFront", 0);
        setIntField(term290703, term290703.getClass(), "avatarBack", 0);
        setIntField(term290703, term290703.getClass(), "classEmblemBase", 0);
        setIntField(term290703, term290703.getClass(), "classEmblemMedal", 0);
        setIntField(term290703, term290703.getClass(), "stockedGridCount", 0);
        setIntField(term290703, term290703.getClass(), "exMapLoopCount", 0);
        setIntField(term290703, term290703.getClass(), "netBattlePlayCount", 0);
        setIntField(term290703, term290703.getClass(), "netBattleWinCount", 0);
        setIntField(term290703, term290703.getClass(), "netBattleLoseCount", 0);
        setIntField(term290703, term290703.getClass(), "netBattleConsecutiveWinCount", 0);
        setIntField(term290703, term290703.getClass(), "charaIllustId", 0);
        setIntField(term290703, term290703.getClass(), "skillId", 0);
        setIntField(term290703, term290703.getClass(), "overPowerPoint", 0);
        setIntField(term290703, term290703.getClass(), "overPowerRate", 0);
        setIntField(term290703, term290703.getClass(), "overPowerLowerRank", 0);
        setIntField(term290703, term290703.getClass(), "avatarPoint", 0);
        setIntField(term290703, term290703.getClass(), "battleRankId", 0);
        setIntField(term290703, term290703.getClass(), "battleRankPoint", 0);
        setIntField(term290703, term290703.getClass(), "eliteRankPoint", 0);
        setIntField(term290703, term290703.getClass(), "netBattle1stCount", 0);
        setIntField(term290703, term290703.getClass(), "netBattle2ndCount", 0);
        setIntField(term290703, term290703.getClass(), "netBattle3rdCount", 0);
        setIntField(term290703, term290703.getClass(), "netBattle4thCount", 0);
        setIntField(term290703, term290703.getClass(), "netBattleCorrection", 0);
        setIntField(term290703, term290703.getClass(), "netBattleErrCnt", 0);
        setIntField(term290703, term290703.getClass(), "netBattleHostErrCnt", 0);
        setIntField(term290703, term290703.getClass(), "battleRewardStatus", 0);
        setIntField(term290703, term290703.getClass(), "battleRewardIndex", 0);
        setIntField(term290703, term290703.getClass(), "battleRewardCount", 0);
        setIntField(term290703, term290703.getClass(), "ext1", 0);
        setIntField(term290703, term290703.getClass(), "ext2", 0);
        setIntField(term290703, term290703.getClass(), "ext3", 0);
        setIntField(term290703, term290703.getClass(), "ext4", 0);
        setIntField(term290703, term290703.getClass(), "ext5", 0);
        setIntField(term290703, term290703.getClass(), "ext6", 0);
        setIntField(term290703, term290703.getClass(), "ext7", 0);
        setIntField(term290703, term290703.getClass(), "ext8", 0);
        setIntField(term290703, term290703.getClass(), "ext9", 0);
        setIntField(term290703, term290703.getClass(), "ext10", 0);
        setField(term290703, term290703.getClass(), "extStr1", null);
        setField(term290703, term290703.getClass(), "extStr2", null);
        setLongField(term290703, term290703.getClass(), "extLong1", 0L);
        setLongField(term290703, term290703.getClass(), "extLong2", 0L);
        setField(term290703, term290703.getClass(), "rankUpChallengeResults", null);
        setBooleanField(term290703, term290703.getClass(), "isNetBattleHost", false);
        setIntField(term290703, term290703.getClass(), "netBattleEndState", 0);
        term290780 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term290780;
        callMethod(klass, "setBattleRankPoint", argTypes, term290703, args);
    }

};


