package lt.petuska.hazelcast.explorer.component.app.workerPage

import lt.petuska.hazelcast.explorer.util.connectClass

val workerPage = connectClass<WorkerPage, WorkerPageProps>(
  mapStateToProps = { state ->
    exploreType = state.exploreType
    target = state.target
  }
)