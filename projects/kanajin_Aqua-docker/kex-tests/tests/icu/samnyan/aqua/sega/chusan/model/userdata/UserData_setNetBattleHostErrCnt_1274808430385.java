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

public class UserData_setNetBattleHostErrCnt_1274808430385 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term291335;
     Object term291412;

    public UserData_setNetBattleHostErrCnt_1274808430385() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term291335 = newInstance(Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserData"));
        setLongField(term291335, term291335.getClass(), "id", 0L);
        setField(term291335, term291335.getClass(), "card", null);
        setField(term291335, term291335.getClass(), "userName", null);
        setIntField(term291335, term291335.getClass(), "level", 0);
        setIntField(term291335, term291335.getClass(), "reincarnationNum", 0);
        setField(term291335, term291335.getClass(), "exp", null);
        setLongField(term291335, term291335.getClass(), "point", 0L);
        setLongField(term291335, term291335.getClass(), "totalPoint", 0L);
        setIntField(term291335, term291335.getClass(), "playCount", 0);
        setIntField(term291335, term291335.getClass(), "multiPlayCount", 0);
        setIntField(term291335, term291335.getClass(), "playerRating", 0);
        setIntField(term291335, term291335.getClass(), "highestRating", 0);
        setIntField(term291335, term291335.getClass(), "nameplateId", 0);
        setIntField(term291335, term291335.getClass(), "frameId", 0);
        setIntField(term291335, term291335.getClass(), "characterId", 0);
        setIntField(term291335, term291335.getClass(), "trophyId", 0);
        setIntField(term291335, term291335.getClass(), "playedTutorialBit", 0);
        setIntField(term291335, term291335.getClass(), "firstTutorialCancelNum", 0);
        setIntField(term291335, term291335.getClass(), "masterTutorialCancelNum", 0);
        setIntField(term291335, term291335.getClass(), "totalMapNum", 0);
        setLongField(term291335, term291335.getClass(), "totalHiScore", 0L);
        setLongField(term291335, term291335.getClass(), "totalBasicHighScore", 0L);
        setLongField(term291335, term291335.getClass(), "totalAdvancedHighScore", 0L);
        setLongField(term291335, term291335.getClass(), "totalExpertHighScore", 0L);
        setLongField(term291335, term291335.getClass(), "totalMasterHighScore", 0L);
        setLongField(term291335, term291335.getClass(), "totalUltimaHighScore", 0L);
        setField(term291335, term291335.getClass(), "eventWatchedDate", null);
        setIntField(term291335, term291335.getClass(), "friendCount", 0);
        setField(term291335, term291335.getClass(), "firstGameId", null);
        setField(term291335, term291335.getClass(), "firstRomVersion", null);
        setField(term291335, term291335.getClass(), "firstDataVersion", null);
        setField(term291335, term291335.getClass(), "firstPlayDate", null);
        setField(term291335, term291335.getClass(), "lastGameId", null);
        setField(term291335, term291335.getClass(), "lastRomVersion", null);
        setField(term291335, term291335.getClass(), "lastDataVersion", null);
        setField(term291335, term291335.getClass(), "lastLoginDate", null);
        setField(term291335, term291335.getClass(), "lastPlayDate", null);
        setIntField(term291335, term291335.getClass(), "lastPlaceId", 0);
        setField(term291335, term291335.getClass(), "lastPlaceName", null);
        setField(term291335, term291335.getClass(), "lastRegionId", null);
        setField(term291335, term291335.getClass(), "lastRegionName", null);
        setField(term291335, term291335.getClass(), "lastAllNetId", null);
        setField(term291335, term291335.getClass(), "lastClientId", null);
        setField(term291335, term291335.getClass(), "lastCountryCode", null);
        setField(term291335, term291335.getClass(), "userNameEx", null);
        setField(term291335, term291335.getClass(), "compatibleCmVersion", null);
        setIntField(term291335, term291335.getClass(), "medal", 0);
        setIntField(term291335, term291335.getClass(), "mapIconId", 0);
        setIntField(term291335, term291335.getClass(), "voiceId", 0);
        setIntField(term291335, term291335.getClass(), "avatarWear", 0);
        setIntField(term291335, term291335.getClass(), "avatarHead", 0);
        setIntField(term291335, term291335.getClass(), "avatarFace", 0);
        setIntField(term291335, term291335.getClass(), "avatarSkin", 0);
        setIntField(term291335, term291335.getClass(), "avatarItem", 0);
        setIntField(term291335, term291335.getClass(), "avatarFront", 0);
        setIntField(term291335, term291335.getClass(), "avatarBack", 0);
        setIntField(term291335, term291335.getClass(), "classEmblemBase", 0);
        setIntField(term291335, term291335.getClass(), "classEmblemMedal", 0);
        setIntField(term291335, term291335.getClass(), "stockedGridCount", 0);
        setIntField(term291335, term291335.getClass(), "exMapLoopCount", 0);
        setIntField(term291335, term291335.getClass(), "netBattlePlayCount", 0);
        setIntField(term291335, term291335.getClass(), "netBattleWinCount", 0);
        setIntField(term291335, term291335.getClass(), "netBattleLoseCount", 0);
        setIntField(term291335, term291335.getClass(), "netBattleConsecutiveWinCount", 0);
        setIntField(term291335, term291335.getClass(), "charaIllustId", 0);
        setIntField(term291335, term291335.getClass(), "skillId", 0);
        setIntField(term291335, term291335.getClass(), "overPowerPoint", 0);
        setIntField(term291335, term291335.getClass(), "overPowerRate", 0);
        setIntField(term291335, term291335.getClass(), "overPowerLowerRank", 0);
        setIntField(term291335, term291335.getClass(), "avatarPoint", 0);
        setIntField(term291335, term291335.getClass(), "battleRankId", 0);
        setIntField(term291335, term291335.getClass(), "battleRankPoint", 0);
        setIntField(term291335, term291335.getClass(), "eliteRankPoint", 0);
        setIntField(term291335, term291335.getClass(), "netBattle1stCount", 0);
        setIntField(term291335, term291335.getClass(), "netBattle2ndCount", 0);
        setIntField(term291335, term291335.getClass(), "netBattle3rdCount", 0);
        setIntField(term291335, term291335.getClass(), "netBattle4thCount", 0);
        setIntField(term291335, term291335.getClass(), "netBattleCorrection", 0);
        setIntField(term291335, term291335.getClass(), "netBattleErrCnt", 0);
        setIntField(term291335, term291335.getClass(), "netBattleHostErrCnt", 0);
        setIntField(term291335, term291335.getClass(), "battleRewardStatus", 0);
        setIntField(term291335, term291335.getClass(), "battleRewardIndex", 0);
        setIntField(term291335, term291335.getClass(), "battleRewardCount", 0);
        setIntField(term291335, term291335.getClass(), "ext1", 0);
        setIntField(term291335, term291335.getClass(), "ext2", 0);
        setIntField(term291335, term291335.getClass(), "ext3", 0);
        setIntField(term291335, term291335.getClass(), "ext4", 0);
        setIntField(term291335, term291335.getClass(), "ext5", 0);
        setIntField(term291335, term291335.getClass(), "ext6", 0);
        setIntField(term291335, term291335.getClass(), "ext7", 0);
        setIntField(term291335, term291335.getClass(), "ext8", 0);
        setIntField(term291335, term291335.getClass(), "ext9", 0);
        setIntField(term291335, term291335.getClass(), "ext10", 0);
        setField(term291335, term291335.getClass(), "extStr1", null);
        setField(term291335, term291335.getClass(), "extStr2", null);
        setLongField(term291335, term291335.getClass(), "extLong1", 0L);
        setLongField(term291335, term291335.getClass(), "extLong2", 0L);
        setField(term291335, term291335.getClass(), "rankUpChallengeResults", null);
        setBooleanField(term291335, term291335.getClass(), "isNetBattleHost", false);
        setIntField(term291335, term291335.getClass(), "netBattleEndState", 0);
        term291412 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("icu.samnyan.aqua.sega.chusan.model.userdata.UserData");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term291412;
        callMethod(klass, "setNetBattleHostErrCnt", argTypes, term291335, args);
    }

};


